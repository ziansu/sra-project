void doQuery(java.lang.String query) throws java.sql.SQLException {
    java.sql.Statement statement = connection.createStatement();
    statement.executeUpdate(query);
}