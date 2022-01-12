@org.junit.Test
public void testDeleteUnexistingDatastore() throws java.io.FileNotFoundException, java.io.IOException {
    if (!(enabled())) {
        return ;
    }
    java.lang.String wsName = "this_ws_does_not_exist";
    java.lang.String storeName = "this_store_does_not_exist";
    boolean ok = publisher.removeDatastore(wsName, storeName, true);
    assertFalse("removed not existing datastore", ok);
}