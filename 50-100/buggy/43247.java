public static org.apache.activemq.transport.Transport createLocalTransport(org.apache.activemq.broker.Broker broker) throws java.lang.Exception {
    java.net.URI uri = broker.getVmConnectorURI();
    java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>(org.apache.activemq.util.URISupport.parseParameters(uri));
    map.put("network", "true");
    map.put("async", "true");
    map.put("create", "false");
    uri = org.apache.activemq.util.URISupport.createURIWithQuery(uri, org.apache.activemq.util.URISupport.createQueryString(map));
    return org.apache.activemq.transport.TransportFactory.connect(uri);
}