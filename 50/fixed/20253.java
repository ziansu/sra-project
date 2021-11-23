@org.junit.After
public void tearDown() {
    org.skife.jdbi.v2.Handle handle = dbi.open();
    handle.close();
}