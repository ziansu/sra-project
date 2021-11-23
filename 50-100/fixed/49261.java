public org.joda.time.DateTime getMinResultTime(org.hibernate.Session session) {
    org.hibernate.Criteria criteria = session.createCriteria(getObservationTimeClass()).setProjection(org.hibernate.criterion.Projections.min(AbstractObservation.RESULT_TIME)).add(org.hibernate.criterion.Restrictions.eq(AbstractObservation.DELETED, false));
    org.n52.sos.ds.hibernate.dao.observation.AbstractObservationDAO.LOGGER.debug("QUERY getMinResultTime(): {}", org.n52.sos.ds.hibernate.util.HibernateHelper.getSqlString(criteria));
    java.lang.Object min = criteria.uniqueResult();
    return min == null ? null : new org.joda.time.DateTime(min, org.joda.time.DateTimeZone.UTC);
}