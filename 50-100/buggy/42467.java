private java.lang.String getFirstEmptyQueue() {
    java.lang.String queuesStr = properties.get("yarn.scheduler.capacity.root.queues");
    this.allQueues = queuesStr;
    for (java.lang.String queue : com.google.common.base.Splitter.on(",").split(queuesStr)) {
        if ((properties.get((("yarn.scheduler.capacity.root." + queue) + ".capacity")).equals("0")) && (properties.get((("yarn.scheduler.capacity.root." + queue) + ".maximum-capacity")).equals("0"))) {
            return queue;
        }
    }
    return null;
}