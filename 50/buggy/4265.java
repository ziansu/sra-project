@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((server) != null) {
        server.destroy();
    }
}