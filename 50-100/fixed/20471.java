private java.util.List<java.lang.String> getRecordIdsBatch(java.util.Iterator<org.wso2.carbon.analytics.dataservice.Record> recordIterator) throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>(org.wso2.carbon.analytics.dataservice.AnalyticsDataServiceImpl.DELETE_BATCH_SIZE);
    for (int i = 0; (i < (org.wso2.carbon.analytics.dataservice.AnalyticsDataServiceImpl.DELETE_BATCH_SIZE)) & (recordIterator.hasNext()); i++) {
        result.add(recordIterator.next().getId());
    }
    return result;
}