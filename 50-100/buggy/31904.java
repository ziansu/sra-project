@java.lang.Override
public void delete(int tenantId, java.lang.String tableName, java.util.List<java.lang.String> ids) throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException, org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsTableNotAvailableException {
    tableName = org.wso2.carbon.analytics.datasource.core.util.GenericUtils.normalizeTableName(tableName);
    java.lang.String arsName = this.getRecordStoreNameByTable(tenantId, tableName);
    if (arsName == null) {
        throw new org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsTableNotAvailableException(tenantId, tableName);
    }
    this.getIndexer().delete(tenantId, tableName, ids);
    this.getAnalyticsRecordStore(arsName).delete(tenantId, tableName, ids);
}