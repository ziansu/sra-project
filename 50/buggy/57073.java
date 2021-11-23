private static void closeQuietly(java.sql.ResultSet result) {
    if (result == null)
        return ;
    
    try {
        java.sql.Statement statement = result.getStatement();
        result.close();
        NickSifniotis.DatabaseManager.DBManager.closeQuietly(statement);
    } catch (java.lang.Exception e) {
    }
}