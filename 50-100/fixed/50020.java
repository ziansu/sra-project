private ru.otus.pyltsin.HW9.common.User readFromDB(java.lang.String sql, java.lang.Class<?> clazz) throws java.sql.SQLException {
    ru.otus.pyltsin.HW9.common.User userOut = null;
    java.sql.Connection connection = ru.otus.pyltsin.HW9.Helper.ConnectionHelper.getConnection();
    try (java.sql.Statement statement = connection.createStatement()) {
        java.sql.ResultSet rs = statement.executeQuery(sql);
        userOut = buildObject(rs, clazz);
    }
    connection.close();
    return userOut;
}