@java.lang.Override
protected java.io.Serializable doCreate(final org.apache.shiro.session.Session session) {
    final java.io.Serializable sessionId = jdbcSessionSqlDao.inTransaction(new org.skife.jdbi.v2.Transaction<java.lang.Long, org.killbill.billing.util.security.shiro.dao.JDBCSessionSqlDao>() {
        @java.lang.Override
        public java.lang.Long inTransaction(final org.killbill.billing.util.security.shiro.dao.JDBCSessionSqlDao transactional, final org.skife.jdbi.v2.TransactionStatus status) throws java.lang.Exception {
            transactional.create(new org.killbill.billing.util.security.shiro.dao.SessionModelDao(session));
            return transactional.getLastInsertId();
        }
    });
    assignSessionId(session, sessionId);
    return sessionId;
}