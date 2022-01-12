@java.lang.Override
public java.lang.Integer countProjectListByUidAndStatus(java.lang.String userId, java.lang.String[] statusList) {
    java.lang.String hql = "select count(*) from ProjectEntity project where project.userId=:userId and project.status in :statusList";
    org.hibernate.Query query = this.currentSession().createQuery(hql);
    query.setString("userId", userId);
    query.setParameterList("statusList", statusList);
    java.lang.Integer count = query.executeUpdate();
    return count;
}