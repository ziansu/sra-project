public int getIngredientByName(java.lang.String name) throws java.sql.SQLException {
    this.name = name;
    connection = myDatabase.getDatabaseConn();
    java.sql.PreparedStatement statement = connection.prepareStatement("SELECT id,description FROM ingredient WHERE name = ? COLLATE NOCASE;");
    statement.setString(1, name);
    java.sql.ResultSet results = statement.executeQuery();
    this.id = results.getInt(1);
    this.description = results.getString(2);
    connection.close();
    return results.getInt(1);
}