public org.joda.time.DateTime getMaxResultTime(org.hibernate.Session session) {
    org.hibernate.Criteria criteria = session.createCriteria(getObservationTimeClass()).setProjection(org.hibernate.criterion.Projections.max(AbstractObservation.RESULT_TIME)).add(org.hibernate.criterion.Restrictions.eq(AbstractObservation.DELETED, false));
    org.n52.sos.ds.hibernate.dao.observation.AbstractObservationDAO.LOGGER.debug("QUERY getMaxResultTime(): {}", org.n52.sos.ds.hibernate.util.HibernateHelper.getSqlString(criteria));
    java.lang.Object max = criteria.uniqueResult();
    if (max == null) {
        return null;
    }else {
        return new org.joda.time.DateTime(max, org.joda.time.DateTimeZone.UTC);
    }
}