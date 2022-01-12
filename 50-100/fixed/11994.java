@java.lang.Override
public java.util.List<org.shunya.server.services.TaskRun> findTaskHistoryByTeam(long teamId) {
    org.hibernate.Criteria criteria = DBDao.getSessionFactory().getCurrentSession().createCriteria(org.shunya.server.services.TaskRun.class);
    criteria.setFetchSize(30);
    criteria.add(org.hibernate.criterion.Restrictions.eq("team.id", teamId));
    criteria.addOrder(org.hibernate.criterion.Order.desc("id"));
    criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
    criteria.setMaxResults(30);
    criteria.setCacheable(true);
    return criteria.list();
}