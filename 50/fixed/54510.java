@org.junit.Test(expected = java.net.UnknownHostException.class)
public void shouldThrowUnknownHostException() throws java.lang.Exception {
    com.izettle.metrics.influxdb.InfluxDbUdpSender influxDbUdpSender = new com.izettle.metrics.influxdb.InfluxDbUdpSender("testtestasdfg", 10080, 1000, "test", "");
    influxDbUdpSender.writeData(new byte[0]);
}