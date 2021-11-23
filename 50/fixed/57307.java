public java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
    return wrap(preparedStatement, sql);
}