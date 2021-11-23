public java.util.List<cn.edu.ustb.sem.order.entity.Order> listForceScheduleOrder() {
    java.lang.String hql = ((((((((((("from " + (this.tableName)) + " o where (o.status = ") + (cn.edu.ustb.sem.order.entity.OrderStatus.initial)) + " ") + "or o.processIsCheck = ") + (cn.edu.ustb.sem.order.entity.Order.PROCESS_IS_NOT_CHECKED)) + " ") + "or o.materialIsChecked = ") + (cn.edu.ustb.sem.order.entity.Order.PROCESS_IS_NOT_CHECKED)) + ") ") + "and o.status != ") + (cn.edu.ustb.sem.order.entity.OrderStatus.forced);
    return list(hql, (-1), (-1));
}