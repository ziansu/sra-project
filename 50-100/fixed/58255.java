public boolean checkEmailUnique(java.lang.String email) throws java.sql.SQLException {
    java.lang.String query = "SELECT COUNT(1) FROM users" + (" WHERE email = ?" + " LIMIT 1");
    java.sql.PreparedStatement stmt = conn.prepareStatement(query);
    stmt.setString(1, email);
    java.sql.ResultSet results = stmt.executeQuery();
    results.next();
    return (results.getInt(1)) == 1;
}