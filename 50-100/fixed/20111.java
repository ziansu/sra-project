public void updateCriteria(org.hibernate.Criteria crit, com.breezejs.query.EntityQuery entityQuery) {
    java.lang.Integer takeCount = entityQuery.getTakeCount();
    if (takeCount != null)
        crit.setMaxResults(takeCount);
    
    java.lang.Integer skipCount = entityQuery.getSkipCount();
    if (skipCount != null)
        crit.setFirstResult(skipCount);
    
    addWhere(crit, entityQuery.getWherePredicate());
    addSelect(crit, entityQuery.getSelectClause());
    addOrderBy(crit, entityQuery.getOrderByClause());
}