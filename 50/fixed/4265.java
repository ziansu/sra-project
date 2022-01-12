@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((this.server) != null) {
        this.server.destroy();
    }
}