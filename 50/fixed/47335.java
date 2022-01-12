@java.lang.Override
protected void initPersistence(org.apache.activemq.broker.BrokerService brokerService) throws java.io.IOException {
    broker.setPersistent(true);
    broker.setDataDirectoryFile(dataFileDir);
}