@java.lang.Override
public void removeMetric(io.tehuti.metrics.TehutiMetric metric) {
    synchronized(io.tehuti.metrics.JmxReporter.lock) {
        java.lang.String[] names = io.tehuti.utils.Utils.splitMetricName(((prefix) + (metric.name())));
        java.lang.String qualifiedName = ((names[0]) + ".") + (names[1]);
        if (mbeans.containsKey(qualifiedName)) {
            unregister(mbeans.get(qualifiedName));
        }
    }
}