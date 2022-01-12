@org.junit.Test
public void testGetLocatorsForReRollHigherLevelToRerollGranularity() throws java.io.IOException {
    boolean isReroll = true;
    com.rackspacecloud.blueflood.rollup.SlotKey destSlotKey = com.rackspacecloud.blueflood.rollup.SlotKey.of(Granularity.MIN_240, 0, TEST_SHARD);
    com.rackspacecloud.blueflood.rollup.Granularity delayedMetricsRerollGranularity = com.rackspacecloud.blueflood.rollup.Granularity.MIN_60;
    com.rackspacecloud.blueflood.rollup.Granularity delayedMetricsStorageGranularity = com.rackspacecloud.blueflood.rollup.Granularity.MIN_20;
    com.rackspacecloud.blueflood.service.LocatorFetchRunnable lfrunnable = new com.rackspacecloud.blueflood.service.LocatorFetchRunnable(scheduleCtx, destSlotKey, rollupReadExecutor, rollupWriteExecutor);
    java.util.Set<com.rackspacecloud.blueflood.types.Locator> locatorsForRollup = lfrunnable.getLocators(executionContext, isReroll, delayedMetricsRerollGranularity, delayedMetricsStorageGranularity);
    org.junit.Assert.assertEquals(locators.size(), locatorsForRollup.size());
}