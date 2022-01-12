public static long getTotalPhysicalMemory() {
    try {
        com.sun.management.OperatingSystemMXBean o = ((com.sun.management.OperatingSystemMXBean) (java.lang.management.ManagementFactory.getOperatingSystemMXBean()));
        return o.getTotalPhysicalMemorySize();
    } catch (java.lang.Throwable t) {
        org.jackhuang.hellominecraft.HMCLog.warn("Failed to get total physical memory size");
        return -1;
    }
}