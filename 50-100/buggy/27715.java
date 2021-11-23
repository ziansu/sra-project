public java.sql.ResultSet querySQL(java.lang.String query) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    if (!(checkConnection())) {
        openConnection();
    }
    java.sql.Statement statement = connection.createStatement();
    java.sql.ResultSet result = statement.executeQuery(query);
    return result;
}