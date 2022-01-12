@java.lang.Override
public java.lang.Integer countHistorySubmit(java.lang.String teacherId) {
    org.hibernate.criterion.DetachedCriteria dc = org.hibernate.criterion.DetachedCriteria.forClass(edu.ynu.entity.ProjectEntity.class);
    java.lang.String[] status = new java.lang.String[]{ "已立项" , "待加入采购计划" , "待采购" , "采购完成" };
    dc.add(org.hibernate.criterion.Restrictions.in("status", status));
    return projectDao.countByCriteria(dc);
}