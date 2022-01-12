@java.lang.Override
public void close() throws java.sql.SQLException {
    if ((connection) != null) {
        if (com.intrack.transaction.jdbc.JdbcTransaction.log.isDebugEnabled()) {
            com.intrack.transaction.jdbc.JdbcTransaction.log.debug((("Closing JDBC Connection [" + (connection)) + "]"));
        }
        if ((connectionPool) != null) {
            connectionPool.release(connection);
        }else {
            connection.close();
        }
        connection = null;
    }
}