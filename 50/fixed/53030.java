public java.util.SortedMap<java.lang.String, com.codahale.metrics.Histogram> getHistograms(com.codahale.metrics.MetricFilter filter) {
    return adaptMetrics(com.codahale.metrics.Histogram.class, reg.getHistograms(transformFilter(filter)));
}