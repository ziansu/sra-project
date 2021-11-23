public java.util.List<ids.model.Entity> getAll() throws java.sql.SQLException {
    java.lang.String query = "SELECT * FROM " + (getTableName());
    java.sql.PreparedStatement st = getConnection().prepareStatement(query);
    java.lang.System.out.println(query);
    java.sql.ResultSet resultSet = st.executeQuery();
    java.util.LinkedList<ids.model.Entity> results = new java.util.LinkedList<ids.model.Entity>();
    while (resultSet.next()) {
        ids.model.Entity elem = fillEntity(resultSet);
        results.add(elem);
    } 
    return results;
}