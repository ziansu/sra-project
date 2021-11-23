public java.sql.ResultSet query(java.lang.String queryClause) {
    java.sql.ResultSet rs = null;
    try {
        java.sql.Statement stmt = con.createStatement();
        rs = stmt.executeQuery(queryClause);
        stmt.close();
    } catch (java.sql.SQLException e) {
        com.xl.database.DatabaseManager.logger.error(("Error execute the SQL clause: " + queryClause), e);
    }
    return rs;
}