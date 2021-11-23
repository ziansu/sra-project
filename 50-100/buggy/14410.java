public void addEventStoreConfiguration(int tenantId, org.wso2.carbon.analytics.eventsink.AnalyticsEventStore analyticsEventStore) throws org.wso2.carbon.analytics.eventsink.exception.AnalyticsEventStoreException {
    java.util.Set<org.wso2.carbon.analytics.eventsink.AnalyticsEventStore> analyticsEventStoreList = tenantEventStoreMap.get(tenantId);
    if (analyticsEventStoreList == null) {
        synchronized(this) {
            analyticsEventStoreList = tenantEventStoreMap.get(tenantId);
            if (analyticsEventStoreList == null) {
                analyticsEventStoreList = new java.util.LinkedHashSet<>();
            }
        }
    }
    analyticsEventStoreList.add(analyticsEventStore);
}