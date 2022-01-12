protected long _count(org.hibernate.Criteria criteria) {
    criteria.setProjection(org.hibernate.criterion.Projections.rowCount());
    java.lang.Object result = criteria.uniqueResult();
    if (result == null) {
        return 0;
    }
    return ((java.lang.Long) (result));
}