private static long maxSafeSizeInBytes() {
    final long max = java.lang.Runtime.getRuntime().maxMemory();
    final long free = java.lang.Runtime.getRuntime().freeMemory();
    final long total = java.lang.Runtime.getRuntime().totalMemory();
    return (free >> 1) + ((max - total) >> 1);
}