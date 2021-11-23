public java.util.List<org.glowroot.collector.AggregateIntervalCollector> getOrderedIntervalCollectorsInRange(long from, long to) {
    java.util.List<org.glowroot.collector.AggregateIntervalCollector> intervalCollectors = com.google.common.collect.Lists.newArrayList();
    for (org.glowroot.collector.AggregateIntervalCollector intervalCollector : getOrderedAllIntervalCollectors()) {
        long endTime = intervalCollector.getEndTime();
        if ((endTime >= from) && (endTime <= to)) {
            intervalCollectors.add(intervalCollector);
        }
    }
    return intervalCollectors;
}