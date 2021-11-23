@java.lang.Override
public void removedService(org.osgi.framework.ServiceReference<org.apache.aries.jax.rs.whiteboard.internal.CXFJaxRsServiceRegistrator> reference, org.apache.aries.jax.rs.whiteboard.internal.CXFJaxRsServiceRegistrator service) {
    org.apache.aries.jax.rs.whiteboard.internal.CXFJaxRsServiceRegistrator serviceRegistrator = _bundleContext.getService(reference);
    try {
        serviceRegistrator.removeProvider(service);
    } finally {
        _bundleContext.ungetService(reference);
    }
}