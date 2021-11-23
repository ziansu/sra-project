public java.lang.String execute(java.lang.String query) throws java.rmi.RemoteException, org.wso2.carbon.analytics.spark.admin.stub.AnalyticsProcessorAdminServiceAnalyticsProcessorAdminExceptionException {
    org.wso2.carbon.analytics.spark.admin.stub.AnalyticsProcessorAdminServiceStub.AnalyticsQueryResultDto queryResult = stub.executeQuery(query);
    return toJsonResult(query, queryResult);
}