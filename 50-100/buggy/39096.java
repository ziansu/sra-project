public static void close(java.sql.Connection connection) {
    try {
        if ((connection != null) && (connection.isClosed())) {
            connection.close();
        }
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}