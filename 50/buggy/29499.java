@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    doRemoveAll(regionName, "p2pkey-", numberOfEntries);
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    assertEquals(0, region.size());
}