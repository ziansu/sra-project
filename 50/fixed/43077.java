public java.util.Collection<org.apache.hadoop.yarn.server.resourcemanager.scheduler.fair.FSQueue> getQueues() {
    synchronized(queues) {
        return queues.values();
    }
}