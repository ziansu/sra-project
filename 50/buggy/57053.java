private void closeAll(java.sql.Connection connection, java.sql.PreparedStatement... statements) throws java.sql.SQLException {
    for (java.sql.PreparedStatement statement : statements) {
        statement.close();
    }
    connection.close();
}