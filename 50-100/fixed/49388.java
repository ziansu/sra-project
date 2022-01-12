public boolean equals(com.mapr.distiller.server.datatypes.ProcMetricDescriptor d) {
    return (((metricName.equals(d.metricName)) && (queueName.equals(d.queueName))) && ((periodicity) == (d.periodicity))) && ((queueCapacity) == (d.queueCapacity));
}