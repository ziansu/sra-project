@java.lang.Override
public void start(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    bundleContext.registerService(com.pi4j.io.gpio.service.GpioService.class.getName(), new com.pi4j.io.gpio.service.impl.GpioServiceImpl(), null);
    bundleContext.registerService(com.pi4j.system.service.SystemInformationService.class.getName(), new com.pi4j.system.service.impl.SystemInformationServiceImpl(), null);
    bundleContext.registerService(com.pi4j.system.service.NetworkInformationService.class.getName(), new com.pi4j.system.service.impl.NetworkInformationServiceImpl(), null);
}