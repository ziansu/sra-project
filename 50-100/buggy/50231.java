@org.apache.felix.scr.annotations.Activate
protected void activate(org.osgi.framework.BundleContext bundleContext) {
    defaultSessionTimeout = org.apache.sling.commons.osgi.PropertiesUtil.toLong(bundleContext.getProperty(org.liveSense.core.session.SessionFactoryService.PROP_DEFAULT_SESSION_TIMEOUT), org.liveSense.core.session.SessionFactoryService.DEFAULT_DEFAULT_SESSION_TIMEOUT);
    sessionCloseTimeout = org.apache.sling.commons.osgi.PropertiesUtil.toLong(bundleContext.getProperty(org.liveSense.core.session.SessionFactoryService.PROP_SESSION_CLOSE_TIMEOUT), org.liveSense.core.session.SessionFactoryService.DEFAULT_SESSION_CLOSE_TIMEOUT);
    sessionTimeoutCheckInterval = org.apache.sling.commons.osgi.PropertiesUtil.toLong(bundleContext.getProperty(org.liveSense.core.session.SessionFactoryService.PROP_SESSION_TIMEOUT_CHECK_INTERVAL), org.liveSense.core.session.SessionFactoryService.DEFAULT_SESSION_TIMEOUT_CHECK_INTERVAL);
    factoryCloseTimeout = org.apache.sling.commons.osgi.PropertiesUtil.toLong(bundleContext.getProperty(org.liveSense.core.session.SessionFactoryService.PROP_FACTORY_CLOSE_TIMEOUT), org.liveSense.core.session.SessionFactoryService.DEFAULT_FACTORY_CLOSE_TIMEOUT);
    sessionFactory = org.liveSense.core.session.SessionFactoryImpl.getInstance(defaultSessionTimeout, sessionTimeoutCheckInterval, sessionCloseTimeout, factoryCloseTimeout);
}