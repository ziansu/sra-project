@org.junit.Test
public void testGetCache() throws java.lang.Exception {
    org.springframework.cache.Cache cache = manager.getCache("bucket");
    assertNotNull(cache);
    assertSame(cache, manager.getCache("bucket"));
}