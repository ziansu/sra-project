private void closeResources(java.sql.Connection connection) throws java.sql.SQLException {
    if (connection != null) {
        connection.close();
    }
}