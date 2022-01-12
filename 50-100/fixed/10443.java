private static void close(java.sql.Statement statement) {
    try {
        if (statement == null) {
            return ;
        }
        java.sql.Connection connection = statement.getConnection();
        statement.close();
        connection.close();
    } catch (java.sql.SQLException e) {
        com.mayhew3.drafttower.server.PlayerDataSourceImpl.logger.log(java.util.logging.Level.SEVERE, "Unable to close SQL connection after use.", e);
    }
}