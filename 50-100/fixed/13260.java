public static java.util.List<org.wso2.carbon.analytics.datasource.commons.Record> getRecordsForTable(java.lang.String username, java.lang.String tableName, java.util.List<org.wso2.carbon.analytics.restapi.beans.RecordBean> recordBeans) throws org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException {
    java.util.List<org.wso2.carbon.analytics.datasource.commons.Record> records = new java.util.ArrayList<>();
    for (org.wso2.carbon.analytics.restapi.beans.RecordBean recordBean : recordBeans) {
        records.add(new org.wso2.carbon.analytics.datasource.commons.Record(recordBean.getId(), org.wso2.carbon.analytics.restapi.Utils.getTenantId(username), tableName, org.wso2.carbon.analytics.restapi.Utils.validateAndReturn(recordBean.getValues())));
    }
    return records;
}