public static java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql, java.lang.String[] columnNames) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, columnNames);
    return jodd.db.debug.LoggablePreparedStatementFactory.wrap(preparedStatement, sql);
}