public void addEventStoreConfiguration(int tenantId, org.wso2.carbon.analytics.eventsink.AnalyticsEventStore analyticsEventStore) throws org.wso2.carbon.analytics.eventsink.exception.AnalyticsEventStoreException {
    java.util.Set<org.wso2.carbon.analytics.eventsink.AnalyticsEventStore> analyticsEventStoreList = this.tenantEventStoreMap.get(tenantId);
    if (analyticsEventStoreList == null) {
        synchronized(this) {
            analyticsEventStoreList = this.tenantEventStoreMap.get(tenantId);
            if (analyticsEventStoreList == null) {
                analyticsEventStoreList = new java.util.LinkedHashSet<>();
                this.tenantEventStoreMap.put(tenantId, analyticsEventStoreList);
            }
        }
    }
    analyticsEventStoreList.add(analyticsEventStore);
}