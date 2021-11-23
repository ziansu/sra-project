public java.util.Map<java.lang.String, java.lang.Object> getAPILifeCycleData(org.wso2.carbon.apimgt.impl.APIIdentifier apiId) throws org.wso2.carbon.apimgt.api.APIManagementException {
    checkPublishPermission();
    return super.getAPILifeCycleData(apiId);
}