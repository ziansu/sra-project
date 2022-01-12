@com.hazelcast.simulator.test.annotations.Run
public void run() {
    com.hazelcast.simulator.utils.ThreadSpawner spawner = new com.hazelcast.simulator.utils.ThreadSpawner(testContext.getTestId());
    for (int i = 0; i < (threadCount); i++) {
        spawner.spawn(new com.hazelcast.simulator.tests.icache.EntryProcessorICacheTest.Worker());
    }
    spawner.awaitCompletion();
}