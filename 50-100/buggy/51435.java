public java.util.Date getUpdatedFromDB() {
    return ((java.util.Date) (this.currentSession().createCriteria(org.candlepin.model.Rules.class).setCacheable(true).setCacheRegion(CandlepinCacheRegions.FIVE_SECONDS_QUERY_CACHE).setProjection(org.hibernate.criterion.Projections.projectionList().add(org.hibernate.criterion.Projections.max("updated"))).uniqueResult()));
}