private void commit(java.sql.Connection connection) throws java.sql.SQLException {
    if ((!(connection.getAutoCommit())) && ((connection.getTransactionIsolation()) != (java.sql.Connection.TRANSACTION_NONE))) {
        connection.commit();
    }
    connection.close();
}