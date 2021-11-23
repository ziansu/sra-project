@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    org.apache.geode.internal.cache.PutAllCSDUnitTest.checkRegionSize(region, 100);
    doRemoveAll(regionName, "case2-", numberOfEntries);
}