@org.junit.Test
public void shouldCallToPersistenceObtainWhenCacheObtainIsCalled() throws java.lang.Exception {
    org.mockito.Mockito.when(persistence.obtain(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY)).thenReturn(java.util.Collections.EMPTY_LIST);
    com.mobilejazz.cacheio.detector.cacheentry.ObjectCacheValueStrategy objectCacheValueStrategy = org.mockito.Mockito.mock(com.mobilejazz.cacheio.detector.cacheentry.ObjectCacheValueStrategy.class);
    org.powermock.api.mockito.PowerMockito.mockStatic(com.mobilejazz.cacheio.detector.cacheentry.CacheEntryDetectorFactory.class);
    org.powermock.api.mockito.PowerMockito.when(com.mobilejazz.cacheio.detector.cacheentry.CacheEntryDetectorFactory.obtain(org.mockito.Matchers.anyList())).thenReturn(objectCacheValueStrategy);
    cache.obtain(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY);
    org.mockito.Mockito.verify(persistence).obtain(com.mobilejazz.cacheio.CacheManagerTest.FAKE_KEY);
}