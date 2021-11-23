private java.lang.Object getChannelService() {
    org.osgi.framework.ServiceReference serviceReference = bundleContext.getServiceReference("org.motechproject.tasks.service.ChannelService");
    return serviceReference != null ? bundleContext.getService(serviceReference) : null;
}