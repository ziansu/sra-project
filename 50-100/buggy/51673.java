private int executeUpdate(java.sql.Connection connection) {
    try {
        java.lang.String convertedPreparedStatement = convertIntoPreparedStatement(sql);
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(convertedPreparedStatement);
        applyParameterMapToPreparedStatement(preparedStatement, parameterMap, parametersInSqlSorted);
        int numberOfChangedLines = preparedStatement.executeUpdate();
        return numberOfChangedLines;
    } catch (java.sql.SQLException ex) {
        throw new org.sqlify.SqlifyException("Ops. Something strange happened", ex);
    }
}