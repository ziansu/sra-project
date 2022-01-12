@java.lang.Override
public void run2() throws org.apache.geode.cache.CacheException {
    org.apache.geode.cache.Region region = getRootRegion().getSubregion(regionName);
    assertEquals(0, region.size());
    org.apache.geode.internal.cache.PutAllCSDUnitTest.MyWriter mywriter = ((org.apache.geode.internal.cache.PutAllCSDUnitTest.MyWriter) (region.getAttributes().getCacheWriter()));
    org.apache.geode.test.dunit.LogWriterUtils.getLogWriter().info(("server cachewriter triggered for destroy: " + (mywriter.num_destroyed)));
    assertEquals(numberOfEntries, mywriter.num_destroyed);
}