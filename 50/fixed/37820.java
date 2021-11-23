@org.junit.Test
public void shouldFailCacheDeleteIfPersistenceDeleteThrowException() throws java.lang.Exception {
    when(persistence.delete(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY)).thenThrow(com.mobilejazz.cacheio.exceptions.CacheErrorException.class);
    boolean result = cache.delete(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY);
    org.assertj.core.api.Assertions.assertThat(result).isFalse();
}