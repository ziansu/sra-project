public final <T> org.osgi.framework.ServiceRegistration<?> registerService(java.lang.Class<T> iface, T instance, java.util.Dictionary<java.lang.String, java.lang.String> dictionary) {
    com.puresoltechnologies.commons.osgi.AbstractActivator.logger.info((("Register service '{}' for interface '{}' (context='" + (context.getBundle().getSymbolicName())) + "')."), instance.getClass().getName(), iface.getName());
    org.osgi.framework.ServiceRegistration<?> serviceRegistration = context.registerService(iface, instance, dictionary);
    serviceRegistrations.add(serviceRegistration);
    return serviceRegistration;
}