package com.entity.view;

import com.entity.ZhiweifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职位分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
@TableName("zhiweifenlei")
public class ZhiweifenleiView  extends ZhiweifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiweifenleiView(){
	}
 
 	public ZhiweifenleiView(ZhiweifenleiEntity zhiweifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zhiweifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
