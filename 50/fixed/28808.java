@org.junit.Test
public void testLogDetailedPerformanceInfo_onEmptyContainer() {
    emptyPerformanceStateContainer.logDetailedPerformanceInfo(1);
    org.junit.Assert.assertFalse(com.hazelcast.simulator.coordinator.PerformanceStateContainerTest.PERFORMANCE_FILE.exists());
}