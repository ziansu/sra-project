public java.util.List<org.sonar.db.ce.CeActivityDto> selectByQuery(org.sonar.db.DbSession dbSession, org.sonar.db.ce.CeTaskQuery query, int offset, int pageSize) {
    if (query.isShortCircuitedByComponentUuids()) {
        return java.util.Collections.emptyList();
    }
    return org.sonar.db.ce.CeActivityDao.mapper(dbSession).selectByQuery(query, new org.apache.ibatis.session.RowBounds(offset, pageSize));
}