@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    org.apache.geode.test.dunit.Wait.pause(5000);
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    org.apache.geode.cache.Region.Entry re = region.getEntry("case3-1");
    assertNull(re);
    re = region.getEntry("case3-2");
    assertNull(re);
    re = region.getEntry("case3-3");
    assertNull(re);
}