private void close(final java.sql.Connection connection) {
    if (connection == null) {
        return ;
    }
    try {
        connection.close();
    } catch (final java.sql.SQLException ignored) {
    }
}