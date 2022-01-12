public boolean checkDupUsername(java.lang.String username) throws java.sql.SQLException {
    java.sql.Statement stmt = conn.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery((("SELECT COUNT(*) FROM TTEDB.Users where UserName = '" + username) + "'"));
    rs.next();
    int cnt = rs.getInt(1);
    stmt.close();
    conn.close();
    return cnt == 0;
}