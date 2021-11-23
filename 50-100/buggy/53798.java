public java.lang.String getIngredientByNumber(int id) throws java.sql.SQLException {
    connection = myDatabase.getDatabaseConn();
    java.sql.PreparedStatement statement = connection.prepareStatement(("SELECT name,description FROM ingredient " + "WHERE id = ?;"));
    statement.setInt(1, id);
    java.sql.ResultSet results = statement.executeQuery();
    this.name = results.getString(1);
    this.description = results.getString(2);
    connection.close();
    return results.getString(1);
}