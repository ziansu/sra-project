public <T> java.util.Iterator<T> iterator(java.sql.Connection connection, java.lang.String sql, java.lang.Object[] parameters, lazycat.series.jdbc.JdbcType[] jdbcTypes, lazycat.series.jdbc.mapper.RowMapper<T> rowMapper) throws java.sql.SQLException {
    return query(connection, sql, lazycat.series.jdbc.PreparedStatementSetters.newJdbcTypeSetter(parameters, jdbcTypes, typeHandlerRegistry, typeConverter), new lazycat.series.jdbc.IteratorResultSetExtractor<T>(rowMapper));
}