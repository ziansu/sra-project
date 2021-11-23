public static void updateCriteria(org.hibernate.Criteria crit, com.breezejs.query.EntityQuery entityQuery) {
    java.lang.Integer takeCount = entityQuery.getTakeCount();
    if (takeCount != null)
        crit.setMaxResults(takeCount);
    
    java.lang.Integer skipCount = entityQuery.getSkipCount();
    if (skipCount != null)
        crit.setFirstResult(skipCount);
    
    com.breezejs.hib.CriteriaBuilder.addWhere(crit, entityQuery.getWherePredicate());
    com.breezejs.hib.CriteriaBuilder.addSelect(crit, entityQuery.getSelectClause());
    com.breezejs.hib.CriteriaBuilder.addOrderBy(crit, entityQuery.getOrderByClause());
}