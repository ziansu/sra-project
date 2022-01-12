public boolean checkUser(java.lang.String email, java.lang.String password) throws java.sql.SQLException {
    java.lang.String query = "SELECT passwordhash" + ((" FROM users" + " WHERE email=?") + " LIMIT 1");
    java.sql.PreparedStatement stmt = conn.prepareStatement(query);
    stmt.setString(1, email);
    java.sql.ResultSet result = stmt.executeQuery();
    if (!(result.next())) {
        return false;
    }
    java.lang.String hashedPassword = result.getString("passwordhash");
    return org.mindrot.BCrypt.checkpw(password, hashedPassword);
}