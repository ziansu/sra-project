public static org.wso2.carbon.apimgt.api.model.APIStore getExternalAPIStore(java.lang.String apiStoreName, int tenantId) throws org.wso2.carbon.apimgt.api.APIManagementException {
    java.util.Set<org.wso2.carbon.apimgt.api.model.APIStore> externalAPIStoresConfig = org.wso2.carbon.apimgt.impl.utils.APIUtil.getExternalStores(tenantId);
    for (org.wso2.carbon.apimgt.api.model.APIStore apiStoreConfig : externalAPIStoresConfig) {
        if (apiStoreConfig.getName().equals(apiStoreName)) {
            return apiStoreConfig;
        }
    }
    return null;
}