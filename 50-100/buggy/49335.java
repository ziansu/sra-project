java.sql.ResultSet GetUserData(java.lang.String username, java.lang.String password) throws java.sql.SQLException {
    java.sql.ResultSet rs = null;
    try {
        statement = conn.prepareStatement("SELECT * FROM login_users WHERE userName = ? AND userPass = ?");
        statement.setString(1, username);
        statement.setString(2, password);
        rs = statement.executeQuery();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return rs;
}