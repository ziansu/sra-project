@java.lang.Override
public void createTable(int tenantId, java.lang.String recordStoreName, java.lang.String tableName) throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException {
    if (analyticsDataConfiguration.getOperationMode().equals(AnalyticsDataConfiguration.Mode.LOCAL)) {
        org.wso2.carbon.analytics.api.internal.ServiceHolder.getAnalyticsDataService().createTable(tenantId, recordStoreName, tableName);
    }else {
        org.wso2.carbon.analytics.api.internal.client.AnalyticsAPIHttpClient.getInstance().validateAndAuthenticate(analyticsDataConfiguration.getUsername(), analyticsDataConfiguration.getPassword());
        org.wso2.carbon.analytics.api.internal.client.AnalyticsAPIHttpClient.getInstance().createTable(tenantId, null, recordStoreName, tableName, false);
    }
}