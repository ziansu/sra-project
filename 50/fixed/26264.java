public synchronized void updatePerformanceState(com.hazelcast.simulator.protocol.core.SimulatorAddress workerAddress, java.util.Map<java.lang.String, com.hazelcast.simulator.worker.performance.PerformanceState> performanceStates) {
    workerPerformanceStateMap.put(workerAddress, performanceStates);
}