public java.lang.Object invoke(org.jmock.api.Invocation invocation) throws java.lang.Throwable {
    org.apache.activemq.transport.discovery.DiscoveryNetworkReconnectTest.LOG.info(("Mbean Registered: " + (invocation.getParameter(0))));
    mbeanRegistered.release();
    return new javax.management.ObjectInstance(((javax.management.ObjectName) (invocation.getParameter(0))), "dscription");
}