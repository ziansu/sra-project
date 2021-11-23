public void run() {
    Chi.DatabaseCassandra.cluster = com.datastax.driver.core.Cluster.builder().withCredentials(Chi.Config.getConfig(Config.CONFIG_SERVER_DATABASE_CASSANDRA_USERNAME_KEY), Chi.Config.getConfig(Config.CONFIG_SERVER_DATABASE_CASSANDRA_PASSWORD_KEY)).withPort(java.lang.Integer.parseInt(Chi.Config.getConfig(Config.CONFIG_SERVER_DATABASE_CASSANDRA_PORT_KEY))).addContactPoint(Chi.Config.getConfig(Config.CONFIG_SERVER_DATABASE_CASSANDRA_IP_KEY)).build();
    Chi.DatabaseCassandra.session = Chi.DatabaseCassandra.cluster.connect("Chi");
    Chi.DatabaseReading.initialize();
}