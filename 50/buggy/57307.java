public static java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
    return jodd.db.debug.LoggablePreparedStatementFactory.wrap(preparedStatement, sql);
}