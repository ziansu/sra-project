public javax.sql.rowset.CachedRowSet manual_query(java.lang.String query, java.lang.Object... values) throws java.sql.SQLException {
    if ((connection) == null) {
        throw new java.lang.IllegalStateException();
    }
    java.sql.PreparedStatement preparedStatement = null;
    java.sql.ResultSet rs = null;
    javax.sql.rowset.CachedRowSet cachedRowSet = null;
    cachedRowSet = new com.sun.rowset.CachedRowSetImpl();
    preparedStatement = connection.prepareStatement(query);
    repository.MySQLAccess.setValues(preparedStatement, values);
    if (preparedStatement.execute()) {
        rs = preparedStatement.getResultSet();
        cachedRowSet.populate(rs);
    }
    return cachedRowSet;
}