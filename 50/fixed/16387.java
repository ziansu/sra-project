public java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql, int resultSetType, int resultSetConcurrency) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, resultSetType, resultSetConcurrency);
    return wrap(preparedStatement, sql);
}