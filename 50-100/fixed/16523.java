private void registerLogCollector() {
    synchronized(logCollectorRegCount) {
        int count = logCollectorRegCount.getAndIncrement();
        if (count == 0) {
            org.osgi.framework.ServiceRegistration reg = bundleContext.registerService(ch.qos.logback.classic.turbo.TurboFilter.class.getName(), this.logCollector, null);
            logCollectorReg.set(reg);
        }
    }
}