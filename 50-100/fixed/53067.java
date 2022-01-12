@java.lang.Override
public boolean removeTopic(java.lang.String topicName) throws org.wso2.carbon.andes.event.core.exception.EventBrokerException {
    try {
        org.wso2.carbon.registry.core.session.UserRegistry userRegistry = this.registryService.getGovernanceSystemRegistry(org.wso2.carbon.andes.event.core.internal.ds.EventBrokerHolder.getInstance().getTenantId());
        java.lang.String resourcePath = org.wso2.carbon.andes.event.core.internal.util.JavaUtil.getResourcePath(topicName, this.topicStoragePath);
        removeRoleCreateForLoggedInUser(topicName);
        if (userRegistry.resourceExists(resourcePath)) {
            userRegistry.delete(resourcePath);
            return true;
        }else {
            return false;
        }
    } catch (org.wso2.carbon.registry.core.exceptions.RegistryException e) {
        throw new org.wso2.carbon.andes.event.core.exception.EventBrokerException("Cannot access the config registry", e);
    }
}