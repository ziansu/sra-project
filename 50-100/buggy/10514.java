public void removeStatsProvider(org.osgi.framework.ServiceReference<org.inaetics.demonstrator.api.stats.StatsProvider> serviceRef, org.inaetics.demonstrator.api.stats.StatsProvider provider) {
    if ("true".equals(serviceRef.getProperty("aggregator"))) {
        m_aggregator = null;
    }
    java.lang.String type = "" + (serviceRef.getProperty("type"));
    if ("processor".equalsIgnoreCase(type)) {
        m_processorCount.decrementAndGet();
    }else
        if ("producer".equalsIgnoreCase(type)) {
            m_producerCount.decrementAndGet();
        }
    
    m_providerStats.remove(serviceRef);
    log(("added statsprovider of type " + type));
}