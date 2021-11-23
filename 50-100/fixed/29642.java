public final void stop() {
    com.github.mk23.jmxproxy.jmx.ConnectionManager.LOG.info("stopping jmx connection manager");
    purge.shutdown();
    for (java.util.Map.Entry<java.lang.String, com.github.mk23.jmxproxy.jmx.ConnectionWorker> hostEntry : hosts.entrySet()) {
        com.github.mk23.jmxproxy.jmx.ConnectionManager.LOG.debug(("purging " + (hostEntry.getKey())));
        hosts.remove(hostEntry.getKey()).shutdown();
    }
    hosts.clear();
    started = false;
}