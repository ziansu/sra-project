private static void closeQuietly(java.sql.Statement statement) {
    if (statement == null)
        return ;
    
    try {
        java.sql.Connection connection = statement.getConnection();
        statement.close();
        NickSifniotis.DatabaseManager.DBManager.closeQuietly(connection);
    } catch (java.lang.Exception e) {
    }
}