@java.lang.Override
public void run() {
    com.github.mk23.jmxproxy.jmx.ConnectionManager.LOG.debug("begin expiring stale hosts");
    for (java.util.Map.Entry<java.lang.String, com.github.mk23.jmxproxy.jmx.ConnectionWorker> hostEntry : hosts.entrySet()) {
        if (hostEntry.getValue().isExpired(config.getAccessDuration().toMilliseconds())) {
            com.github.mk23.jmxproxy.jmx.ConnectionManager.LOG.debug(("purging " + (hostEntry.getKey())));
            hosts.remove(hostEntry.getKey()).shutdown();
        }
    }
    com.github.mk23.jmxproxy.jmx.ConnectionManager.LOG.debug("end expiring stale hosts");
}