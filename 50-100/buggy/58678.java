protected void activate(org.osgi.service.component.ComponentContext context) {
    try {
        org.osgi.framework.BundleContext bundleContext = context.getBundleContext();
        bundleContext.registerService(this.getClass().getName(), new org.wso2.carbon.mediation.ntask.internal.NtaskService(), null);
        bundleContext.registerService(org.wso2.carbon.core.ServerStartupHandler.class.getName(), new org.wso2.carbon.mediation.ntask.NTaskTaskManager(), null);
        org.wso2.carbon.mediation.ntask.internal.NtaskService.logger.debug("ntask-integration bundle is activated.");
    } catch (java.lang.Throwable e) {
        org.wso2.carbon.mediation.ntask.internal.NtaskService.logger.error(("Could not activate NTaskService. Error: " + (e.getMessage())), e);
    }
}