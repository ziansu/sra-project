public java.lang.String getPath(java.lang.String name) throws java.sql.SQLException {
    java.sql.PreparedStatement statement = con.prepareStatement((("SELECT path FROM " + (TABLENAME)) + " WHERE name=?"));
    statement.setString(1, name);
    java.sql.ResultSet result = statement.executeQuery();
    result.next();
    java.lang.String path = result.getString("path");
    statement.close();
    return path;
}