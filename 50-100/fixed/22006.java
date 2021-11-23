public void testGet() throws java.lang.Exception {
    com.test.kv.lib.storage.MemoryStorage<java.lang.String, java.lang.Object> testMemoryStorage = new com.test.kv.lib.storage.MemoryStorage();
    try {
        testMemoryStorage.Get("NoSuchKey");
        assertTrue(false);
    } catch (com.test.kv.exceptions.KVKeyDoesNotExistsException e) {
        assertNotNull(e);
    }
    testMemoryStorage.Set("testKey", "testValue");
    java.lang.String value = ((java.lang.String) (testMemoryStorage.Get("testKey")));
    assertEquals("testValue", value);
}