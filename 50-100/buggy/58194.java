public java.sql.ResultSet select(java.lang.String query) {
    java.sql.Statement statement = null;
    try {
        statement = getConnection().createStatement();
        return statement.executeQuery(query);
    } catch (java.sql.SQLException ex) {
        log.severe(("Error at SQL Query: " + (ex.getMessage())));
        log.severe(("Query: " + query));
    } finally {
        try {
            statement.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}