public void testDel() throws java.lang.Exception {
    com.test.kv.lib.storage.MemoryStorage<java.lang.String, java.lang.String> testMemoryStorage = new com.test.kv.lib.storage.MemoryStorage(100);
    java.lang.Boolean successSet = testMemoryStorage.Set("testKey", "testValue");
    assertTrue(successSet);
    java.lang.Boolean successDel = testMemoryStorage.Del("testKey");
    assertTrue(successDel);
    try {
        testMemoryStorage.Del("NoSuchKey");
        assertTrue(false);
    } catch (com.test.kv.exceptions.KVKeyDoesNotExistsException e) {
        assertNotNull(e);
    }
}