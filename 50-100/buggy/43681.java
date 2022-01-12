private java.util.List<org.wso2.carbon.apimgt.api.model.API> getAPIsByProvider(java.lang.String providerId) throws org.wso2.carbon.apimgt.usage.client.exception.APIMgtUsageQueryServiceClientException {
    try {
        if (APIUsageStatisticsClientConstants.ALL_PROVIDERS.equals(providerId)) {
            return apiProviderImpl.getAllAPIs();
        }else {
            return apiProviderImpl.getAPIsByProvider(providerId);
        }
    } catch (org.wso2.carbon.apimgt.api.APIManagementException e) {
        throw new org.wso2.carbon.apimgt.usage.client.exception.APIMgtUsageQueryServiceClientException(("Error while retrieving APIs by " + providerId), e);
    }
}