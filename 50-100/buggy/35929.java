@org.junit.Test
public void testAddingLowValueAfterHighValue() {
    org.roaringbitmap.longlong.RoaringTreeMap map = new org.roaringbitmap.longlong.RoaringTreeMap();
    map.addLong(java.lang.Long.MAX_VALUE);
    org.junit.Assert.assertEquals(java.lang.Long.MAX_VALUE, map.select(0));
    map.addLong(666);
    org.junit.Assert.assertEquals(666, map.select(0));
    org.junit.Assert.assertEquals(java.lang.Long.MAX_VALUE, map.select(0));
}