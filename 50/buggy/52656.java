@com.hazelcast.simulator.test.annotations.TimeStep(prob = 0.1)
public void destroyMap(com.hazelcast.simulator.tests.map.MapPredicateTest.ThreadState state) {
    map.destroy();
    initMap();
    (state.operationCounter.destroyCount)++;
}