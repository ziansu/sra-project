@org.junit.Test(timeout = 30000)
public void testCreateConnectionAndStart() throws java.lang.Exception {
    org.apache.qpid.jms.JmsConnectionFactory factory = new org.apache.qpid.jms.JmsConnectionFactory(getConnectionURI(false));
    org.apache.qpid.jms.JmsConnection connection = ((org.apache.qpid.jms.JmsConnection) (factory.createConnection()));
    org.junit.Assert.assertNotNull(connection);
    connection.start();
    connection.close();
}