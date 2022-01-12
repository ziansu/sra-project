public static org.osgi.framework.ServiceRegistration<org.osgi.service.component.ComponentFactory> registerComponentFactory() {
    final org.osgi.service.component.ComponentFactory componentFactory = new org.gamegineer.common.internal.core.impl.logging.AbstractHandlerFactory<org.gamegineer.common.internal.core.impl.logging.FakeHandler>(org.gamegineer.common.core.runtime.NullAnalysis.nonNull(org.gamegineer.common.internal.core.impl.logging.FakeHandler.class)) {    };
    final java.util.Dictionary<java.lang.String, java.lang.Object> properties = new java.util.Hashtable<>();
    properties.put(ComponentConstants.COMPONENT_FACTORY, org.gamegineer.common.internal.core.impl.logging.FakeHandler.class.getName());
    return org.gamegineer.common.internal.core.impl.Activator.getDefault().getBundleContext().registerService(org.osgi.service.component.ComponentFactory.class, componentFactory, properties);
}