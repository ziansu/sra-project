public static void createRegistryCollection(java.lang.String path, java.lang.String resourceName) throws org.wso2.carbon.device.mgt.common.permission.mgt.PermissionManagementException, org.wso2.carbon.registry.api.RegistryException {
    org.wso2.carbon.registry.api.Resource resource = org.wso2.carbon.device.mgt.core.permission.mgt.PermissionUtils.getGovernanceRegistry().newCollection();
    resource.addProperty(org.wso2.carbon.device.mgt.core.permission.mgt.PermissionUtils.PERMISSION_PROPERTY_NAME, resourceName);
    org.wso2.carbon.device.mgt.core.permission.mgt.PermissionUtils.getGovernanceRegistry().beginTransaction();
    org.wso2.carbon.device.mgt.core.permission.mgt.PermissionUtils.getGovernanceRegistry().put(path, resource);
    org.wso2.carbon.device.mgt.core.permission.mgt.PermissionUtils.getGovernanceRegistry().commitTransaction();
}