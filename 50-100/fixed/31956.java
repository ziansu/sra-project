public java.lang.String getPath(java.lang.String name) throws java.sql.SQLException {
    java.lang.String path;
    try (java.sql.PreparedStatement statement = con.prepareStatement((("SELECT path FROM " + (TABLENAME)) + " WHERE name=?"))) {
        statement.setString(1, name);
        java.sql.ResultSet result = statement.executeQuery();
        result.next();
        path = result.getString("path");
    }
    return path;
}