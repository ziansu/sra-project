@org.junit.Test
public void clear() {
    java.util.Set<java.lang.Object> keySet = new java.util.HashSet<java.lang.Object>();
    keySet.add(1);
    keySet.add(2);
    doReturn(keySet).when(limitedMap).keySet();
    doNothing().when(indexHandler).clear();
    cache.clear();
    verify(limitedMap, times(2)).remove(any());
}