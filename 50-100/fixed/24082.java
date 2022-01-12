public int updateSQL(java.lang.String query) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    if (!(checkConnection())) {
        openConnection();
    }
    java.sql.Statement statement = this.connection.createStatement();
    int result = statement.executeUpdate(query);
    return result;
}