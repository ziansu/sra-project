private static int getAvlCPUCount() {
    int coreCount = java.lang.Runtime.getRuntime().availableProcessors();
    return coreCount <= 1 ? 1 : coreCount - 1;
}