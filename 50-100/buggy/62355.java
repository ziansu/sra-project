public void Execute(java.lang.String query) throws java.sql.SQLException {
    java.sql.Connection connection;
    java.sql.Statement statement = null;
    try {
        connection = Connect();
        statement = connection.createStatement();
        statement.execute(query);
    } finally {
        NickSifniotis.DatabaseManager.DBManager.closeQuietly(statement);
    }
}