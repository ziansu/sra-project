public javax.management.remote.JMXConnector newJMXConnector(javax.management.remote.JMXServiceURL serviceURL, java.util.Map<java.lang.String, ?> environment) throws java.io.IOException {
    java.lang.String protocol = serviceURL.getProtocol();
    if (((org.jboss.remotingjmx.Constants.PROTOCOL.equals(protocol)) || (org.jboss.remotingjmx.Constants.HTTP_PROTOCOL.equals(protocol))) || (org.jboss.remotingjmx.Constants.HTTPS_PROTOCOL.equals(protocol))) {
        return new org.jboss.remotingjmx.RemotingConnector(serviceURL, environment);
    }
    org.jboss.remotingjmx.RemotingConnectorProvider.log.tracef("Protocol (%s) not recognised by this provider.", protocol);
    return null;
}