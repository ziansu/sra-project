@java.lang.Override
public void put(java.util.List<org.wso2.carbon.analytics.datasource.core.rs.Record> records) throws org.wso2.carbon.analytics.datasource.core.AnalyticsException, org.wso2.carbon.analytics.datasource.core.rs.AnalyticsTableNotAvailableException {
    this.getAnalyticsRecordStore().put(records);
    this.getIndexer().put(records);
}