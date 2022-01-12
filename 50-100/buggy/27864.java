public boolean containsMetricName(java.lang.String metricName) {
    java.util.ListIterator<com.mapr.distiller.server.datatypes.ProcMetricDescriptor> i = metricList.listIterator();
    while (i.hasNext()) {
        if ((i.next().metricName) == metricName)
            return true;
        
    } 
    return false;
}