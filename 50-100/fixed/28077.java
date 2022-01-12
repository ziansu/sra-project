private <T> T executeSelect(java.sql.Connection connection) {
    try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        java.sql.ResultSet resultSet = preparedStatement.executeQuery();
        T t = resultParser.parseResultSet(resultSet);
        return t;
    } catch (java.lang.Exception e) {
        throw new org.sqlify.SqlifyException("Ops. Something strange happened", e);
    }
}