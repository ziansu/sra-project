int getCount(com.hazelcast.simulator.common.WorkerType type) {
    int count = 0;
    for (com.hazelcast.simulator.agent.workerprocess.WorkerProcessSettings workerProcessSettings : workerProcessSettingsList) {
        if (workerProcessSettings.getWorkerType().equals(type)) {
            count++;
        }
    }
    return count;
}