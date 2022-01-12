private java.util.List selectSummaryStatementSQsBySumId(long summStId) {
    database.Session s = database.DBClinReason.instance.getInternalSession(java.lang.Thread.currentThread(), false);
    database.Criteria criteria = s.createCriteria(beans.relation.SummaryStatementSQ.class, "SummaryStatementSQ");
    criteria.add(database.Restrictions.eq("summStId", new java.lang.Long(summStId)));
    return criteria.list();
}