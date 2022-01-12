public boolean loginValidator(java.lang.String username, java.lang.String password) {
    java.sql.Statement statement;
    java.sql.ResultSet myRs = null;
    try {
        statement = dbconn.createStatement();
        myRs = statement.executeQuery((((("SELECT * FROM users WHERE email = '" + username) + "' AND password = '") + password) + "'"));
        while (myRs.next()) {
            return true;
        } 
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}