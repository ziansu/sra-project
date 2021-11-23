@org.junit.Test
public void testGetCache() throws java.lang.Exception {
    org.springframework.cache.Cache cache = this.manager.getCache("bucket");
    assertNotNull(cache);
    assertSame(cache, this.manager.getCache("bucket"));
}