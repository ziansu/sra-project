private java.util.List<org.wso2.carbon.analytics.datasource.core.rs.Record> loadIndexOperationRecords(int tenantId, java.lang.String tableName) throws org.wso2.carbon.analytics.datasource.core.AnalyticsException {
    try {
        return org.wso2.carbon.analytics.datasource.core.util.GenericUtils.listRecords(this.getAnalyticsRecordStore(), this.getAnalyticsRecordStore().get(tenantId, tableName, null, (-1), (-1), 0, (-1)));
    } catch (org.wso2.carbon.analytics.datasource.core.rs.AnalyticsTableNotAvailableException e) {
        return new java.util.ArrayList<org.wso2.carbon.analytics.datasource.core.rs.Record>();
    }
}