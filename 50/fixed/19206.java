@org.junit.Test
@java.lang.SuppressWarnings(value = "all")
public void testGetTestPhaseSyncMap_notParallel() {
    java.util.Map<com.hazelcast.simulator.test.TestPhase, java.util.concurrent.CountDownLatch> testPhaseSyncMap = com.hazelcast.simulator.test.TestPhase.getTestPhaseSyncMap(5, false, TestPhase.RUN);
    org.junit.Assert.assertNull(testPhaseSyncMap);
}