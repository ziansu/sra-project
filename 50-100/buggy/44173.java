public static org.wso2.carbon.apimgt.api.model.APIStore getExternalAPIStore(java.lang.String apiStoreName, int tenantId) throws org.wso2.carbon.apimgt.api.APIManagementException {
    java.util.Set<org.wso2.carbon.apimgt.api.model.APIStore> externalAPIStoresConfig = org.wso2.carbon.apimgt.impl.utils.APIUtil.getExternalStores(tenantId);
    org.wso2.carbon.apimgt.api.model.APIStore apiStore = null;
    for (org.wso2.carbon.apimgt.api.model.APIStore apiStoreConfig : externalAPIStoresConfig) {
        if (apiStoreConfig.getName().equals(apiStoreName)) {
            apiStore = apiStoreConfig;
        }
    }
    return apiStore;
}