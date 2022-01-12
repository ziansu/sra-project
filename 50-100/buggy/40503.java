protected static javax.transaction.xa.XAException mapXAExceptionFromSQLException(java.sql.SQLException sqlEx) {
    java.lang.Integer xaCode = com.mysql.jdbc.jdbc2.optional.MysqlXAConnection.MYSQL_ERROR_CODES_TO_XA_ERROR_CODES.get(java.lang.Integer.valueOf(sqlEx.getErrorCode()));
    if (xaCode != null) {
        return ((javax.transaction.xa.XAException) (new com.mysql.jdbc.jdbc2.optional.MysqlXAException(xaCode.intValue(), sqlEx.getMessage(), null).initCause(sqlEx)));
    }
    return ((javax.transaction.xa.XAException) (new com.mysql.jdbc.jdbc2.optional.MysqlXAException(javax.transaction.xa.XAException.XAER_RMFAIL, com.mysql.jdbc.Messages.getString("MysqlXAConnection.003"), null).initCause(sqlEx)));
}