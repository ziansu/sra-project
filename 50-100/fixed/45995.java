@java.lang.Override
public void start(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    this.bundleContext = bundleContext;
    proxyUnwrapperServiceTracker = new org.pentaho.di.osgi.service.tracker.ProxyUnwrapperServiceTracker(bundleContext, osgiPluginTracker);
    proxyUnwrapperServiceTracker.open();
    osgiPluginTracker.setBundleContext(bundleContext);
    osgiPluginTracker.registerPluginClass(org.pentaho.osgi.api.BeanFactory.class);
    osgiPluginTracker.registerPluginClass(org.pentaho.di.core.plugins.PluginInterface.class);
    beanFactoryLookupServiceTracker = new org.pentaho.di.osgi.service.tracker.BeanFactoryLookupServiceTracker(bundleContext, osgiPluginTracker);
    beanFactoryLookupServiceTracker.open();
    org.pentaho.di.osgi.KarafLifecycleListener.getInstance().setBundleContext(bundleContext);
}