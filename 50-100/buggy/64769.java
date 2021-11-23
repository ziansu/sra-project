@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    doPutAll(regionName, "key-", ((numberOfEntries) * 2));
    assertEquals(((numberOfEntries) * 2), region.size());
    doRemoveAll(regionName, "key-", numberOfEntries);
    assertEquals(numberOfEntries, region.size());
}