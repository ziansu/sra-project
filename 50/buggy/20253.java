@org.junit.After
void tearDown() {
    org.skife.jdbi.v2.Handle handle = dbi.open();
    handle.execute("DELETE FROM book");
    handle.close();
}