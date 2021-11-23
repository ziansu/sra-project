@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    org.eclipse.e4.ui.bindings.tests.Activator.plugin = this;
    serviceContext = org.eclipse.e4.core.contexts.EclipseContextFactory.getServiceContext(context);
    appContext = serviceContext.createChild();
}