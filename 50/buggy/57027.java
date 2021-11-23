public static java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql, int[] columnIndexes) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, columnIndexes);
    return jodd.db.debug.LoggablePreparedStatementFactory.wrap(preparedStatement, sql);
}