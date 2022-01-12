@org.junit.After
public void tearDown() throws java.io.IOException {
    realm.dispose();
    if ((stream) != null) {
        stream.close();
    }
}