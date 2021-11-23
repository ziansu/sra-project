protected void activate(org.osgi.service.component.ComponentContext context) {
    org.osgi.framework.BundleContext bundleContext = context.getBundleContext();
    if (org.wso2.carbon.appmgt.mdm.restconnector.internal.MDMComponent.log.isDebugEnabled()) {
        org.wso2.carbon.appmgt.mdm.restconnector.internal.MDMComponent.log.debug("WSO2MDM MDM Component activated");
    }
    try {
        mdmServiceRegistration = bundleContext.registerService(org.wso2.carbon.appmgt.mobile.interfaces.ApplicationOperations.class.getName(), new org.wso2.carbon.appmgt.mdm.restconnector.ApplicationOperationsImpl(), null);
    } catch (java.lang.Throwable e) {
        org.wso2.carbon.appmgt.mdm.restconnector.internal.MDMComponent.log.error((("Failed to activate org.wso2.carbon.appmgt.mdm.restconnector.internal." + "MDMComponent : ") + e));
    }
}