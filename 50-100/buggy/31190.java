@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    doPutAll(regionName, "case2-", numberOfEntries);
    assertEquals(numberOfEntries, region.size());
    for (int i = 0; i < (numberOfEntries); i++) {
        org.apache.geode.internal.cache.PutAllCSDUnitTest.TestObject obj = ((org.apache.geode.internal.cache.PutAllCSDUnitTest.TestObject) (region.getEntry(("case2-" + i)).getValue()));
        assertEquals(i, obj.getPrice());
    }
}