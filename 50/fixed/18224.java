@org.junit.After
public void tearDown() throws java.lang.Exception {
    broker.stop();
    broker.waitUntilStopped();
}