@java.lang.Override
public java.util.List<edu.ynu.entity.ProjectEntity> findProjectListByStatus(java.lang.String[] statusList, java.lang.Integer countPerPage, java.lang.Integer currentPage) {
    java.lang.String hql = "FROM ProjectEntity project where status in :status";
    org.hibernate.Query query = currentSession().createQuery(hql);
    query.setFirstResult(((currentPage - 1) * countPerPage));
    query.setMaxResults(countPerPage);
    query.setParameterList("status", statusList);
    java.util.List projects = query.list();
    java.lang.System.out.println(projects.size());
    return projects;
}