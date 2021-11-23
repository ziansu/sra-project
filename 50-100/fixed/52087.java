private void commit(java.sql.Connection connection) throws java.sql.SQLException {
    try {
        if ((!(connection.getAutoCommit())) && ((connection.getTransactionIsolation()) != (java.sql.Connection.TRANSACTION_NONE))) {
            connection.commit();
        }
    } finally {
        connection.close();
    }
}