@java.lang.Override
public void start(org.osgi.framework.BundleContext context) throws java.lang.Exception {
    m_context = context;
    m_bundle = context.getBundle();
    m_logService = new org.osgi.util.tracker.ServiceTracker<org.osgi.service.log.LogService, org.osgi.service.log.LogService>(m_context, org.apache.felix.scr.impl.Activator.LOGSERVICE_CLASS, null);
    m_logService.open();
    m_configuration.start(m_context);
    org.apache.felix.scr.impl.inject.ClassUtils.setBundleContext(context);
}