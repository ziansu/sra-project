public com.hazelcast.simulator.protocol.registry.WorkerData getFirstWorker() {
    synchronized(workers) {
        if ((workers.size()) == 0) {
            throw new com.hazelcast.simulator.utils.CommandLineExitException("No workers running!");
        }
        return workers.get(0);
    }
}