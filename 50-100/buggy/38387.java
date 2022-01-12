public void start() throws java.lang.Exception {
    org.apache.activemq.broker.BrokerService broker = new org.apache.activemq.broker.BrokerService();
    broker.setBrokerName(brokerName);
    broker.addConnector(brokerUrl);
    org.apache.activemq.usage.SystemUsage systemUsage = broker.getSystemUsage();
    systemUsage.getStoreUsage().setLimit(storeUsage);
    systemUsage.getTempUsage().setLimit(tempUsage);
    broker.setPersistent(false);
    java.lang.System.out.println(("Started ActiveMQ broker: " + (broker.toString())));
}