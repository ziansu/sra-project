public boolean checkCredential(java.lang.String username, java.lang.String password) {
    if (!(accountExist(username))) {
        return false;
    }
    try {
        java.lang.String encryptedPassword = generateHash(password);
        java.sql.ResultSet rs = stmt.executeQuery((("SELECT * FROM accounts WHERE username = \"" + username) + "\";"));
        rs.next();
        return rs.getString("password").equals(encryptedPassword);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}