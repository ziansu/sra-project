public static void close(java.sql.Connection connection, java.sql.PreparedStatement statement) {
    try {
        if ((statement != null) && (statement.isClosed())) {
            statement.close();
        }
        br.com.devmedia.jdbc.connection.JDBCConnection.close(connection);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}