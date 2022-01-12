public void createIngredient(java.lang.String name) throws java.sql.SQLException {
    connection = myDatabase.getDatabaseConn();
    java.sql.PreparedStatement statement = connection.prepareStatement("INSERT INTO ingredient (name) VALUES(?)");
    statement.setString(1, name);
    this.name = name;
    statement.executeUpdate();
    connection.close();
    getIngredientByName(name);
}