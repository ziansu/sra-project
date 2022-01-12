public java.sql.ResultSet getResultSet(java.lang.String sql) throws java.sql.SQLException {
    java.sql.ResultSet rs = null;
    java.sql.Statement stmt = null;
    stmt = this.con.createStatement();
    rs = stmt.executeQuery(sql);
    this.con.commit();
    stmt.close();
    this.con.close();
    return rs;
}