@java.lang.Override
public java.util.List<com.museum.db.model.Activity> getActivitiesBySiteIds(java.util.List<java.lang.Long> siteIds, long startTime) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Query query = session.createQuery("from Activity where siteId in :siteIds and startTime >= :startTime order by startTime");
    query.setParameterList("siteIds", siteIds);
    query.setLong("startTime", startTime);
    return query.list();
}