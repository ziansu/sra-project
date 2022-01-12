private void registerLogCollector(com.adobe.acs.tools.explain_query.impl.ExplainQueryServlet.QueryLogCollector logCollector) {
    synchronized(logCollectorRegCount) {
        int count = logCollectorRegCount.getAndIncrement();
        if (count == 0) {
            org.osgi.framework.ServiceRegistration reg = bundleContext.registerService(ch.qos.logback.classic.turbo.TurboFilter.class.getName(), logCollector, null);
            logCollectorReg.set(reg);
        }
    }
}