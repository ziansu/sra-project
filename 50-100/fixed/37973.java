private org.apache.wicket.metrics.WicketMetricsSettings getSettings() {
    org.apache.wicket.Application application = org.apache.wicket.Application.get();
    org.apache.wicket.metrics.WicketMetricsSettings metricRegistry = application.getMetaData(org.apache.wicket.metrics.WicketMetrics.METRIC_SETTINGS);
    if (metricRegistry == null) {
        metricRegistry = new org.apache.wicket.metrics.WicketMetricsSettings();
        application.setMetaData(org.apache.wicket.metrics.WicketMetrics.METRIC_SETTINGS, metricRegistry);
    }
    return metricRegistry;
}