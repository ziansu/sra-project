public void close() {
    try {
        statement.close();
        connection.close();
    } catch (java.sql.SQLException e) {
        printSQLException(e);
    }
}