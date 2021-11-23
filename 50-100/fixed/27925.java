public javax.sql.rowset.CachedRowSet manual_query(java.lang.String query, java.lang.Object... values) throws java.sql.SQLException {
    if ((connection) == null) {
        throw new java.lang.IllegalStateException();
    }
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query);
    javax.sql.rowset.CachedRowSet cachedRowSet = new com.sun.rowset.CachedRowSetImpl();
    repository.MySQLAccess.setValues(preparedStatement, values);
    if (preparedStatement.execute()) {
        cachedRowSet.populate(preparedStatement.getResultSet());
    }
    return cachedRowSet;
}