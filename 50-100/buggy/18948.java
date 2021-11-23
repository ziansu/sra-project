public boolean verifyUser(java.lang.String username, java.lang.String password) throws java.sql.SQLException {
    java.sql.Statement stmt = conn.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery((((("SELECT COUNT(*) FROM TTEDB.Users where UserName = '" + username) + "' and UserPW = '") + password) + "'"));
    rs.next();
    int cnt = rs.getInt(1);
    stmt.close();
    return cnt != 0;
}