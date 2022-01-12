@java.lang.Override
public void terminatingConfigurationContext(org.apache.axis2.context.ConfigurationContext configCtx) {
    int tenantID = org.wso2.carbon.utils.multitenancy.MultitenantUtils.getTenantId(configCtx);
    org.apache.axis2.context.ConfigurationContext clientContext = org.wso2.carbon.tenant.configcontext.provider.store.TenantConfigurationContextStore.getInstance().getTenantConfigurationContextMap().get(tenantID);
    if (clientContext != null) {
        clientContext.cleanupContexts();
        org.wso2.carbon.tenant.configcontext.provider.store.TenantConfigurationContextStore.getInstance().getTenantConfigurationContextMap().remove(tenantID);
        org.wso2.carbon.tenant.configcontext.provider.listener.Axis2ConfigurationContextObserverImpl.log.info((("Configuration Context for Tenant ID: " + tenantID) + " is removed"));
    }
}