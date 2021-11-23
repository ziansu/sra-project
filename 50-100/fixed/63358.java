@java.lang.Override
protected void doStart() throws java.lang.Exception {
    super.doStart();
    if ((clientConfig) == null) {
        clientConfig = new org.apache.xmlrpc.client.XmlRpcClientConfigImpl();
    }
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    org.apache.camel.util.IntrospectionSupport.getProperties(configuration, params, null, false);
    setProperties(clientConfig, params);
}