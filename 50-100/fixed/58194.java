public java.sql.ResultSet select(java.lang.String query) {
    try {
        java.sql.Statement statement = getConnection().createStatement();
        return statement.executeQuery(query);
    } catch (java.sql.SQLException ex) {
        log.severe(("Error at SQL Query: " + (ex.getMessage())));
        log.severe(("Query: " + query));
    }
    return null;
}