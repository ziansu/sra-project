private void setupJmx(nl.tjonahen.iptableslogd.HttpServerConfigurationMBean config) throws javax.management.InstanceAlreadyExistsException, javax.management.MBeanRegistrationException, javax.management.MalformedObjectNameException, javax.management.NotCompliantMBeanException {
    if (nl.tjonahen.iptableslogd.HttpServer.LOGGER.isLoggable(java.util.logging.Level.INFO)) {
        nl.tjonahen.iptableslogd.HttpServer.LOGGER.log(java.util.logging.Level.INFO, "httpServer setup jmx.");
    }
    javax.management.MBeanServer mbs = java.lang.management.ManagementFactory.getPlatformMBeanServer();
    javax.management.ObjectName name = new javax.management.ObjectName("nl.tjonahen.iptableslogd.HttpServer:type=configuration");
    mbs.registerMBean(config, name);
}