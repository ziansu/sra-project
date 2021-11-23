private org.opennms.netmgt.api.sample.Metric getMetric(java.util.Map<java.lang.String, java.lang.String> parameters, org.opennms.netmgt.config.collectd.jmx.Mbean mbean, org.opennms.netmgt.config.collectd.jmx.Attrib attrib) {
    final java.lang.String sampleAlias = org.opennms.netmgt.jmx.JmxUtils.trimAttributeName(attrib.getAlias());
    final org.opennms.netmgt.api.sample.MetricType metricType = getMetricType(attrib);
    final java.lang.String groupName = org.opennms.netmgt.jmx.JmxUtils.getGroupName(parameters, mbean);
    final org.opennms.netmgt.api.sample.Metric metric = new org.opennms.netmgt.api.sample.Metric(sampleAlias, metricType, groupName);
    return metric;
}