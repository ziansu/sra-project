private java.util.List selectSummaryStatementSQsBySumId(long summStId, database.Session s) {
    database.Criteria criteria = s.createCriteria(beans.relation.SummaryStatementSQ.class, "SummaryStatementSQ");
    criteria.add(database.Restrictions.eq("summStId", new java.lang.Long(summStId)));
    return criteria.list();
}