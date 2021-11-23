public java.sql.ResultSet getResultSet(java.lang.String sql) throws java.sql.SQLException {
    java.sql.ResultSet rs = null;
    java.sql.Statement stmt = null;
    stmt = con.createStatement();
    rs = stmt.executeQuery(sql);
    stmt.close();
    con.close();
    return rs;
}