@org.junit.Test
public void shouldNotThrowException() throws java.lang.Exception {
    java.net.ServerSocket server = new java.net.ServerSocket(10080);
    com.izettle.metrics.influxdb.InfluxDbTcpSender influxDbTcpSender = new com.izettle.metrics.influxdb.InfluxDbTcpSender("0.0.0.0", 10080, 1000, "test", "");
    org.assertj.core.api.Assertions.assertThat(((influxDbTcpSender.writeData(new byte[0])) == 0));
    server.close();
}