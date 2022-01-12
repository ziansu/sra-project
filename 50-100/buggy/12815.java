public void run() throws java.lang.Exception {
    prepareClassPathForUploading();
    com.hazelcast.simulator.coordinator.Coordinator coordinator = newCoordinator();
    try {
        startMembers(coordinator);
        startClients(coordinator);
        com.hazelcast.simulator.coordinator.TestSuite suite = newTestSuite().setWarmupSeconds(options.warmupSeconds).setDurationSeconds(options.durationSeconds).setWorkerQuery(new com.hazelcast.simulator.coordinator.registry.WorkerQuery().setTargetType(TargetType.PREFER_CLIENT));
        coordinator.testRun(new com.hazelcast.simulator.coordinator.operations.RcTestRunOperation(suite));
    } finally {
        coordinator.close();
    }
}