protected com.turn.kafka.metrics.MetricInfo removeMetric(com.yammer.metrics.core.MetricName originalName) {
    java.util.Iterator<com.turn.kafka.metrics.MetricInfo> iter = metrics.iterator();
    while (iter.hasNext()) {
        com.turn.kafka.metrics.MetricInfo mi = iter.next();
        if (mi.getOriginalName().equals(originalName)) {
            iter.remove();
            return mi;
        }
    } 
    return null;
}