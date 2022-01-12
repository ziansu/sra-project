public java.util.List<ids.model.Entity> getAll() throws java.sql.SQLException {
    java.sql.PreparedStatement st = getConnection().prepareStatement(("SELECT * FROM " + (getTableName())));
    java.sql.ResultSet resultSet = st.executeQuery();
    java.util.LinkedList<ids.model.Entity> results = new java.util.LinkedList<ids.model.Entity>();
    while (resultSet.next()) {
        ids.model.Entity elem = fillEntity(resultSet);
        results.add(elem);
    } 
    return results;
}