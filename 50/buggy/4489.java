private void close(final java.sql.Connection connection) {
    try {
        connection.close();
    } catch (final java.sql.SQLException ignored) {
    }
}