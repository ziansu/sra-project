@org.junit.After
public void tearDown() throws java.lang.Exception {
    httpServer.stop();
    httpServer.destroy();
}