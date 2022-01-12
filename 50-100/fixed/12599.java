public java.util.Collection<D> insert(java.util.Collection<D> collection) {
    if (collection == null) {
        return null;
    }
    org.sonar.db.DbSession session = this.getDbSession();
    try {
        for (D dto : collection) {
            getMapper(session).insert(dto);
        }
        session.commit();
    } finally {
        com.thoughtworks.lean.sonar.aggreagtedreport.dao.base.Mybatis.closeQuietly(session);
    }
    return collection;
}