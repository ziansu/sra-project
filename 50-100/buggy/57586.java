public taxon.Taxon findByName(java.lang.String name) throws database.RepositoryException {
    try {
        java.sql.PreparedStatement psFindByName = psFindByName();
        psFindByName.setString(1, name);
        java.sql.ResultSet resultSet = psFindByName.executeQuery();
        if ((resultSet != null) && (resultSet.next())) {
            return resultSetToModel(resultSet);
        }else {
            return null;
        }
    } catch (java.sql.SQLException e) {
        throw new database.RepositoryException(e);
    }
}