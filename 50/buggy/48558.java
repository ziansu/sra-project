private static sandbox.InfluxDbSender GetUdpSender() throws java.lang.Exception {
    return new sandbox.InfluxDbUdpSender("127.0.0.1", 8092, 1000, "dropwizard", java.util.concurrent.TimeUnit.SECONDS, "");
}