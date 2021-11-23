public <T> java.util.Iterator<T> iterator(java.sql.Connection connection, java.lang.String sql, java.lang.Object[] parameters, lazycat.series.jdbc.mapper.RowMapper<T> rowMapper) throws java.sql.SQLException {
    return iterator(connection, sql, lazycat.series.jdbc.PreparedStatementSetters.newIgnoreJdbcTypeSetter(parameters, typeHandlerRegistry, typeConverter), rowMapper);
}