@org.junit.Test
public void shouldCallToPersistenceDeleteWhenCacheDeleteIsCalled() throws java.lang.Exception {
    when(persistence.delete(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY)).thenReturn(true);
    boolean result = cache.delete(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY);
    verify(persistence).delete(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY);
    org.assertj.core.api.Assertions.assertThat(result).isTrue();
}