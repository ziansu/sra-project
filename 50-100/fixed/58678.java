protected void activate(org.osgi.service.component.ComponentContext context) {
    try {
        org.osgi.framework.BundleContext bundleContext = context.getBundleContext();
        org.wso2.carbon.mediation.ntask.internal.NtaskService.logger.debug("ntask-integration bundle is activated.");
    } catch (java.lang.Throwable e) {
        org.wso2.carbon.mediation.ntask.internal.NtaskService.logger.error(("Could not activate NTaskService. Error: " + (e.getMessage())), e);
    }
}