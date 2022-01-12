@org.osgi.service.component.annotations.Activate
public void start(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    org.wso2.carbon.internal.DataHolder.getInstance().setBundleContext(bundleContext);
    org.wso2.carbon.kernel.config.CarbonConfigProvider configProvider = new org.wso2.carbon.internal.kernel.config.XMLBasedConfigProvider();
    org.wso2.carbon.kernel.CarbonRuntime carbonRuntime = org.wso2.carbon.internal.kernel.context.CarbonRuntimeFactory.createCarbonRuntime(configProvider);
    bundleContext.registerService(org.wso2.carbon.kernel.CarbonRuntime.class.getName(), carbonRuntime, null);
}