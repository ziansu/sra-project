void executeUpdateQuery(java.lang.String query) {
    try {
        this.statement.executeUpdate(query);
        this.statement.close();
        this.connection.commit();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e);
        java.lang.System.err.println(e.getMessage());
    }
}