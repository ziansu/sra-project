public void closeConnection() throws com.emsmigrations.MigrationException {
    try {
        conn.close();
    } catch (com.emsmigrations.JMSException e) {
        throw new com.emsmigrations.MigrationException("Could not close connection", e);
    }
}