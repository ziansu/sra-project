public static boolean putRegistryResource(java.lang.String path, org.wso2.carbon.registry.api.Resource resource) throws org.wso2.carbon.device.mgt.extensions.device.type.template.exception.DeviceTypeMgtPluginException {
    try {
        org.wso2.carbon.registry.core.Registry registry = org.wso2.carbon.device.mgt.extensions.device.type.template.util.DeviceTypeUtils.getConfigurationRegistry();
        if (registry == null) {
            return false;
        }else {
            registry.beginTransaction();
            registry.put(path, resource);
            registry.commitTransaction();
            return true;
        }
    } catch (org.wso2.carbon.registry.api.RegistryException e) {
        throw new org.wso2.carbon.device.mgt.extensions.device.type.template.exception.DeviceTypeMgtPluginException(("Error occurred while persisting registry resource : " + (e.getMessage())), e);
    }
}