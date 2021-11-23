@org.junit.Test
public void loadAuthenticator() throws java.lang.Exception {
    java.util.Properties props = new java.util.Properties(io.moquette.server.IntegrationUtils.prepareTestProperties());
    props.setProperty(BrokerConstants.AUTHENTICATOR_CLASS_NAME, "io.moquette.server.ConfigurationClassLoaderTest");
    startServer(props);
    assertTrue(true);
    m_server.stopServer();
}