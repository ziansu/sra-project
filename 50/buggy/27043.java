@org.junit.After
public void tearDown() throws java.lang.Exception {
    m_server.stopServer();
    java.io.File dbFile = new java.io.File(m_config.getProperty(BrokerConstants.PERSISTENT_STORE_PROPERTY_NAME));
    if (dbFile.exists()) {
        dbFile.delete();
    }
}