@java.lang.Override
public void close() {
    if ((serviceRegistration) != null) {
        serviceRegistration.unregister();
        serviceRegistration = null;
    }
    org.everit.osgi.ecm.component.ri.internal.ComponentContextImpl<C> componentImpl = componentAtomicReference.get();
    if ((componentImpl != null) && ((componentImpl.getComponentMetadata().getConfigurationPolicy()) == (org.everit.osgi.ecm.metadata.ConfigurationPolicy.IGNORE))) {
        componentImpl.close();
        componentAtomicReference.set(null);
    }
}