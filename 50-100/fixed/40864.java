@org.junit.Test
public void clear() {
    limitedMap.put(1, new java.lang.Object());
    limitedMap.put(2, new java.lang.Object());
    doNothing().when(indexHandler).clear();
    cache.clear();
    verify(limitedMap, times(2)).remove(any());
    verify(indexHandler).clear();
}