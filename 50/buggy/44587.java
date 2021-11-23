@org.junit.After
public void after() throws java.lang.Exception {
    server.stopServer();
    kafka.stop();
    zk.stop();
    com.ctrip.hermes.metrics.HermesMetricsRegistry.reset();
}