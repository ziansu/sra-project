@org.osgi.service.component.annotations.Activate
protected void start(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    logger.info("Service Component is activated");
    serviceRegistration = bundleContext.registerService(org.wso2.carbon.andes.amqp.Greeter.class.getName(), new org.wso2.carbon.andes.amqp.GreeterImpl("WSO2"), null);
}