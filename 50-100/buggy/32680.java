private static int maxSafeSizeInBytes() {
    final long max = java.lang.Runtime.getRuntime().maxMemory();
    final long free = java.lang.Runtime.getRuntime().freeMemory();
    final long total = java.lang.Runtime.getRuntime().totalMemory();
    return ((int) ((free + (max - total)) / 2));
}