@org.junit.After
public void tearDown() throws java.io.IOException {
    if ((this.link) != null) {
        this.link.close();
    }
}