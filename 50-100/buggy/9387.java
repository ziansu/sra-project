public boolean addUser(java.lang.String username, java.lang.String password) throws java.sql.SQLException {
    java.sql.Statement stmt = conn.createStatement();
    boolean success = stmt.execute((((("insert into TTEDB.Users (UserName, UserPW) values ('" + username) + "', '") + password) + "')"));
    stmt.close();
    return success;
}