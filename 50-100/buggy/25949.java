public static com.linkedin.pinot.broker.broker.helix.HelixBrokerStarter startDefault() throws java.lang.Exception {
    org.apache.commons.configuration.Configuration configuration = new org.apache.commons.configuration.PropertiesConfiguration();
    int port = 5001;
    configuration.addProperty(CommonConstants.Helix.KEY_OF_BROKER_QUERY_PORT, port);
    configuration.addProperty("pinot.broker.timeoutMs", (500 * 1000L));
    final com.linkedin.pinot.broker.broker.helix.HelixBrokerStarter pinotHelixBrokerStarter = new com.linkedin.pinot.broker.broker.helix.HelixBrokerStarter("quickstart", "localhost:2122", configuration);
    return pinotHelixBrokerStarter;
}