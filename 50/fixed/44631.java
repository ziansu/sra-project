@java.lang.Override
public boolean hasValidator(java.lang.String pluginId) {
    org.osgi.framework.ServiceReference ref = getReference(org.backmeup.model.spi.Validationable.class, pluginId);
    return ref != null;
}