@org.junit.Test
public void testConnectRemoteBrokerFacade() throws java.lang.Exception {
    brokerFacade = new org.apache.activemq.web.RemoteJMXBrokerFacade();
    org.apache.activemq.web.config.SystemPropertiesConfiguration configuration = new org.apache.activemq.web.config.SystemPropertiesConfiguration();
    brokerFacade.setConfiguration(configuration);
    javax.management.ObjectName query = new javax.management.ObjectName("org.apache.activemq:type=Broker,brokerName=remoteBroker");
    java.util.Set<javax.management.ObjectName> queryResult = brokerFacade.queryNames(query, null);
    java.lang.System.out.println(("Number: " + (queryResult.size())));
    org.junit.Assert.assertEquals(1, queryResult.size());
}