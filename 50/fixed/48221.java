public java.sql.PreparedStatement create(java.sql.Connection connection, java.lang.String sql, java.lang.String[] columnNames) throws java.sql.SQLException {
    java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql, columnNames);
    return wrap(preparedStatement, sql);
}