public java.lang.String getUserPw(java.lang.String username) {
    connectDb();
    try {
        server.DBgetpw.stmt = server.DBgetpw.conn.createStatement();
        java.sql.ResultSet results = server.DBgetpw.stmt.executeQuery(("select * from users where username =" + username));
        results.next();
        pw = results.getString(2);
        results.close();
    } catch (java.sql.SQLException sqlExcept) {
        sqlExcept.printStackTrace();
    }
    closeDb();
    return pw;
}