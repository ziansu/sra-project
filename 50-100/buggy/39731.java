private static long getHostPhysicalMemory() {
    try {
        javax.management.MBeanServer server = java.lang.management.ManagementFactory.getPlatformMBeanServer();
        java.lang.Object attribute = server.getAttribute(new javax.management.ObjectName("java.lang", "type", "OperatingSystem"), "TotalPhysicalMemorySize");
        return ((java.lang.Long) (attribute));
    } catch (javax.management.JMException e) {
        com.parallels.desktopcloud.ParallelsDesktopConnectorSlaveComputer.LOGGER.log(java.util.logging.Level.SEVERE, "Failed to get host RAM size: %s", e);
        return java.lang.Long.MAX_VALUE;
    }
}