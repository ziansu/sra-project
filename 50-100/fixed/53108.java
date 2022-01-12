public boolean checkNameUnique(java.lang.String name) throws java.sql.SQLException {
    java.lang.String query = "SELECT COUNT(1) FROM users" + (" WHERE name = ?" + " LIMIT 1");
    java.sql.PreparedStatement stmt = conn.prepareStatement(query);
    stmt.setString(1, name);
    java.sql.ResultSet results = stmt.executeQuery();
    results.next();
    return (results.getInt(1)) == 1;
}