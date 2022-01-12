public int executeUpdate(java.lang.String query, java.lang.Object... parameters) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = null;
    int result = 0;
    try {
        try {
            preparedStatement = createPreparedStatement(query, parameters);
            result = preparedStatement.executeUpdate();
        } finally {
            close(preparedStatement);
        }
    } catch (java.sql.SQLException ex) {
        close();
    }
    return result;
}