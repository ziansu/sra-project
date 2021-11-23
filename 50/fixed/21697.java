public void start() {
    com.emc.storageos.services.util.NamedScheduledThreadPoolExecutor threadPoolExecutor = new com.emc.storageos.services.util.NamedScheduledThreadPoolExecutor(com.emc.storageos.auth.impl.LdapProviderMonitor.LDAP_MONITOR_NAME, 1);
    threadPoolExecutor.scheduleAtFixedRate(new com.emc.storageos.auth.impl.LdapProviderMonitor.LdapMonitorWorker(), 0, com.emc.storageos.auth.impl.LdapProviderMonitor.MONITOR_INTERVAL_MIN, java.util.concurrent.TimeUnit.MINUTES);
    com.emc.storageos.auth.impl.LdapProviderMonitor.log.info("LdapProvider Monitor started.");
}