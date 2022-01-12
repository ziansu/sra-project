public void testConnectorView() throws java.lang.Exception {
    org.apache.activemq.broker.jmx.ConnectorViewMBean connector = getProxyToConnectionView("tcp");
    assertNotNull(connector);
    assertFalse(connector.isRebalanceClusterClients());
    assertFalse(connector.isUpdateClusterClientsOnRemove());
    assertFalse(connector.isUpdateClusterClients());
    assertFalse(connector.isAllowLinkStealingEnabled());
}