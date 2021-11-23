@java.lang.Override
public java.util.List<edu.ynu.message.PurchaseApplySubmit> listHistorySubmit(java.lang.String teacherId, java.lang.Integer count, java.lang.Integer pageNum) {
    org.hibernate.criterion.DetachedCriteria dc = org.hibernate.criterion.DetachedCriteria.forClass(edu.ynu.entity.ProjectEntity.class);
    java.lang.String[] status = new java.lang.String[]{ "已立项" , "待采购" , "采购完成" };
    dc.add(org.hibernate.criterion.Restrictions.in("status", status));
    return edu.ynu.util.TransformUtil.transformToMessageList(projectDao.listByCriteria(dc, count, pageNum));
}