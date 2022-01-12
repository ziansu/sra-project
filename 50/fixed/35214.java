private void closeQuietly(java.sql.Statement statement) {
    if (statement == null)
        return ;
    
    try {
        java.sql.Connection connection = statement.getConnection();
        statement.close();
        closeQuietly(connection);
    } catch (java.lang.Exception e) {
    }
}