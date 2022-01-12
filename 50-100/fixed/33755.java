@java.lang.Override
public void rollback() {
    if (isAutoCommit()) {
        return ;
    }
    if (!(jdbcSession.getActiveFlag().get())) {
        return ;
    }
    try {
        jdbcSession.getActiveFlag().set(false);
        jdbcSession.getJdbcConnection().rollback();
    } catch (java.lang.Exception e) {
        throw new com.zoowii.jpa_utils.exceptions.JdbcTransactionRuntimeException(e);
    }
}