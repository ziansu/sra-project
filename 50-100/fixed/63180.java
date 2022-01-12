public void openConnection() throws com.emsmigrations.MigrationException {
    if ((conn) == null) {
        try {
            com.emsmigrations.ConnectionFactory factory = new com.emsmigrations.TibjmsConnectionFactory(connection.url);
            conn = factory.createConnection(connection.user, connection.password);
        } catch (com.emsmigrations.JMSException e) {
            throw new com.emsmigrations.MigrationException("could not create Connection", e);
        }
    }
}