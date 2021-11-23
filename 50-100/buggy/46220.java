@org.junit.After
public void tearDown() throws java.lang.Exception {
    java.lang.System.clearProperty("javax.net.ssl.trustStore");
    java.lang.System.clearProperty("javax.net.ssl.trustStorePassword");
    java.lang.System.clearProperty("javax.net.ssl.trustStoreType");
    java.lang.System.clearProperty("javax.net.ssl.keyStore");
    java.lang.System.clearProperty("javax.net.ssl.keyStorePassword");
    java.lang.System.clearProperty("javax.net.ssl.keyStoreType");
    stopBroker();
}