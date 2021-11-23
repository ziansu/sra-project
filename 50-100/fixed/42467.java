private java.lang.String getFirstEmptyQueue() {
    for (java.lang.String queue : com.google.common.base.Splitter.on(",").split(allQueues)) {
        if ((properties.get((("yarn.scheduler.capacity.root." + queue) + ".capacity")).equals("0")) && (properties.get((("yarn.scheduler.capacity.root." + queue) + ".maximum-capacity")).equals("0"))) {
            return queue;
        }
    }
    return null;
}