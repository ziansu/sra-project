java.sql.ResultSet executeSelectQuery(java.lang.String query) {
    try {
        this.resultSet = this.statement.executeQuery(query);
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println(e.getMessage());
    }
    return this.resultSet;
}