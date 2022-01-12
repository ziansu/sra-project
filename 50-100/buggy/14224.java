private void rollback(java.sql.Connection connection) throws java.sql.SQLException {
    try {
        if ((!(connection.getAutoCommit())) && ((connection.getTransactionIsolation()) != (java.sql.Connection.TRANSACTION_NONE))) {
            connection.rollback();
        }
    } catch (java.sql.SQLException e) {
    }
    connection.close();
}