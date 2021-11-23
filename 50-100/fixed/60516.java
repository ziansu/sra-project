public void run() {
    org.apache.cassandra.service.CassandraDaemon cassandraDaemon = cassandraDaemonRef.get();
    org.apache.flink.streaming.connectors.cassandra.example.EmbeddedCassandraService.LOG.info("Calling stop() on Embedded Cassandra Daemon");
    cassandraDaemon.deactivate();
    org.apache.flink.streaming.connectors.cassandra.example.EmbeddedCassandraService.LOG.info("Shutting down Embedded Cassandra Service");
    cassandraDaemonExecutor.shutdownNow();
    org.apache.flink.streaming.connectors.cassandra.example.EmbeddedCassandraService.LOG.info("Embedded Cassasndra has fully stopped");
    if ((tmpDir) != null) {
        tmpDir.delete();
        org.apache.flink.streaming.connectors.cassandra.example.EmbeddedCassandraService.LOG.info("Temp Cassandra storage deleted");
    }
}