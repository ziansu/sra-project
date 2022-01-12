public static java.lang.String getMemoryUsage() {
    java.lang.management.MemoryMXBean memoryMxBean = java.lang.management.ManagementFactory.getMemoryMXBean();
    java.lang.management.MemoryUsage heap = memoryMxBean.getHeapMemoryUsage();
    return ((((heap.getUsed()) >> 20) + " of ") + ((heap.getCommitted()) >> 20)) + "M";
}