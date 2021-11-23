private java.sql.ResultSet getFirstRow(java.lang.String query, java.lang.Object... params) throws java.sql.SQLException {
    lastPatternMatcher = null;
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query);
    for (int i = 0; i < (params.length); i++) {
        preparedStatement.setObject((i + 1), params[i]);
    }
    preparedStatement.setMaxRows(1);
    return preparedStatement.executeQuery();
}