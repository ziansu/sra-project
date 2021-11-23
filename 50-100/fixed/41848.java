@java.lang.Override
public java.lang.Integer countProjectsUnComplete(java.lang.String userId) {
    java.lang.String status1 = "采购完成";
    java.lang.String status2 = "草稿";
    java.lang.String hql = "select count(*) from ProjectEntity projects where projects.status!=:status1 and projects.status!=:status2 and projects.userId=:userId";
    org.hibernate.Query query = this.currentSession().createQuery(hql);
    query.setString("userId", userId);
    query.setString("status1", status1);
    query.setString("status2", status2);
    java.lang.Long count = ((java.lang.Long) (query.list().get(0)));
    return count.intValue();
}