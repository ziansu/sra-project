private void closeAll(boolean commit, java.sql.Connection connection, java.sql.PreparedStatement... statements) throws java.sql.SQLException {
    if (commit)
        connection.commit();
    
    for (java.sql.PreparedStatement statement : statements) {
        statement.close();
    }
    connection.close();
}