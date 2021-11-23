@org.junit.After
public void tearDown() throws java.lang.Exception {
    connection.close();
    if ((broker) != null) {
        broker.stop();
    }
}