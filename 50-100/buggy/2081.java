@org.junit.Test
public void getFail() {
    final java.lang.UnsupportedOperationException exception = new java.lang.UnsupportedOperationException("Test exception on get");
    org.mockito.BDDMockito.willThrow(exception).given(this.cache).get(0L);
    final java.lang.Object result = this.simpleService.get(0L);
    org.mockito.Mockito.verify(this.errorHandler).handleCacheGetError(exception, cache, 0L);
    org.mockito.Mockito.verify(this.cache).get(0L);
    org.mockito.Mockito.verify(this.cache).put(0L, result);
}