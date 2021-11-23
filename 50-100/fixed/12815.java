public void run() throws java.lang.Exception {
    prepareClassPathForUploading();
    com.hazelcast.simulator.coordinator.Coordinator coordinator = newCoordinator();
    try {
        startMembers(coordinator);
        startClients(coordinator);
        com.hazelcast.simulator.coordinator.TestSuite suite = newTestSuite();
        coordinator.testRun(new com.hazelcast.simulator.coordinator.operations.RcTestRunOperation(suite));
    } finally {
        coordinator.close();
    }
}