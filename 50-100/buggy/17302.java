public static org.wso2.carbon.analytics.eventsink.AnalyticsEventStore getAnalyticsEventStore(java.lang.String streamName, java.lang.String version, org.wso2.carbon.analytics.datasource.commons.AnalyticsSchema schema) throws org.wso2.carbon.analytics.eventsink.exception.AnalyticsEventStoreException {
    org.wso2.carbon.analytics.eventsink.AnalyticsEventStore store = new org.wso2.carbon.analytics.eventsink.AnalyticsEventStore();
    org.wso2.carbon.analytics.eventsink.AnalyticsEventStore.EventSource eventSource = store.new org.wso2.carbon.analytics.eventsink.internal.util.EventSource();
    java.util.List<java.lang.String> streams = new java.util.ArrayList<>();
    streams.add(org.wso2.carbon.databridge.commons.utils.DataBridgeCommonsUtils.generateStreamId(streamName, version));
    eventSource.setStreamIds(streams);
    store.setEventSource(eventSource);
    store.setAnalyticsTableSchema(org.wso2.carbon.analytics.eventsink.internal.util.AnalyticsEventSinkUtil.getAnalyticsTableSchema(schema));
    return store;
}