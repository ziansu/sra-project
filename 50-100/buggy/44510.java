private <T> T executeUpdateAndReturnGeneratedKey(java.sql.Connection connection) {
    try {
        java.lang.String convertedPreparedStatement = convertIntoPreparedStatement(sql);
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(convertedPreparedStatement, java.sql.Statement.RETURN_GENERATED_KEYS);
        applyParameterMapToPreparedStatement(preparedStatement, parameterMap, parametersInSqlSorted);
        preparedStatement.executeUpdate();
        java.sql.ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        return resultParser.parseResultSet(generatedKeys);
    } catch (java.lang.Exception ex) {
        throw new org.sqlify.SqlifyException("Ops. Something strange happened", ex);
    }
}