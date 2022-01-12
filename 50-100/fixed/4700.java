public static void close(java.sql.Connection connection, java.sql.PreparedStatement statement, java.sql.ResultSet resultSet) {
    try {
        if ((resultSet != null) && (!(resultSet.isClosed()))) {
            resultSet.close();
        }
        br.com.devmedia.jdbc.connection.JDBCConnection.close(connection, statement);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}