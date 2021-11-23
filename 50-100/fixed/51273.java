private boolean isEnabled(java.lang.String tagName, java.lang.String tagValue) {
    com.spinn3r.artemis.metrics.init.MetricsConfig.SparseMetricTags sparseMetricTags = metricsConfig.getSparseMetricsIndex().get(tagsProvider.getClass().getName());
    if (sparseMetricTags == null)
        return true;
    
    com.spinn3r.artemis.metrics.init.MetricsConfig.SparseMetricTagValues tagValues = sparseMetricTags.get(tagName);
    if (tagValues == null)
        return true;
    
    if (tagValue == null)
        return false;
    
    return tagValues.contains(tagValue);
}