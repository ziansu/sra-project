@java.lang.Override
public org.wso2.carbon.appmgt.impl.App getApp(java.lang.String type, java.lang.String uuid) throws org.wso2.carbon.appmgt.api.AppManagementException {
    java.util.Map<java.lang.String, java.lang.String> searchTerms = new java.util.HashMap<java.lang.String, java.lang.String>();
    searchTerms.put("id", uuid);
    java.util.List<org.wso2.carbon.appmgt.impl.App> result = searchApps(type, searchTerms);
    if ((result.size()) == 1) {
        return result.get(0);
    }else {
        throw new org.wso2.carbon.appmgt.api.AppManagementException("Duplicate entries found for the given uuid.");
    }
}