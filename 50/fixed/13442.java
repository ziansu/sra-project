public void closeConnection() throws com.emsmigrations.MigrationException {
    try {
        if ((conn) != null) {
            conn.close();
            conn = null;
        }
    } catch (com.emsmigrations.JMSException e) {
        throw new com.emsmigrations.MigrationException("Could not close connection", e);
    }
}