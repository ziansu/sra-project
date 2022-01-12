@org.junit.After
public void tearDown() throws java.io.IOException {
    realm.dispose();
    stream.close();
}