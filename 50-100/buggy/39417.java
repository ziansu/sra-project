int executeUpdate(java.lang.String query) {
    int result = 0;
    try {
        connection = getDBConnection();
        createStatement();
        result = statement.executeUpdate(query);
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    close(new java.lang.AutoCloseable[]{ statement , connection });
    return result;
}