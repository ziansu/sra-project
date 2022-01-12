public boolean equals(com.mapr.distiller.server.datatypes.ProcMetricDescriptor d) {
    return ((((metricName) == (d.metricName)) && ((queueName) == (d.queueName))) && ((periodicity) == (d.periodicity))) && ((queueCapacity) == (d.queueCapacity));
}