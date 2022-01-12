public void start(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    java.util.Properties props = new java.util.Properties();
    props.put("Language", "English");
    bundleContext.registerService(com.pi4j.io.gpio.service.GpioService.class.getName(), new com.pi4j.io.gpio.service.impl.GpioServiceImpl(), props);
    bundleContext.registerService(com.pi4j.system.service.SystemInformationService.class.getName(), new com.pi4j.system.service.impl.SystemInformationServiceImpl(), props);
    bundleContext.registerService(com.pi4j.system.service.NetworkInformationService.class.getName(), new com.pi4j.system.service.impl.NetworkInformationServiceImpl(), props);
}