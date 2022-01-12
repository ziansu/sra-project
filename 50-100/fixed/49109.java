@org.junit.Test
public void openNewStorageAndAddUpdateKey() throws net.simplestorage.exception.StorageException {
    storage.open();
    storage.put(new net.simplestorage.storage.test.util.DataRecord("key1", "data1111"));
    storage.update(new net.simplestorage.storage.test.util.DataRecord("key1", "data1112"));
    net.simplestorage.storage.test.util.DataRecord updated = storage.get("key1");
    java.lang.String data = updated.getData();
    org.junit.Assert.assertEquals("data1112", data);
    storage.close();
}