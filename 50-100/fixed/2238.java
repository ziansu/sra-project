@java.lang.Override
public java.util.List<com.museum.db.model.Activity> getActivitiesBySiteIds(java.util.List<java.lang.Long> siteIds, long startTime) {
    if ((siteIds.size()) == 0)
        return new java.util.ArrayList<com.museum.db.model.Activity>();
    
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Query query = session.createQuery("from Activity where siteId in :siteIds and startTime >= :startTime order by startTime");
    query.setParameterList("siteIds", siteIds);
    query.setLong("startTime", startTime);
    return query.list();
}