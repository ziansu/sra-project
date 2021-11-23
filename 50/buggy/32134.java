private static int getAvlCPUCount() {
    int coreCount = (java.lang.Runtime.getRuntime().availableProcessors()) - 1;
    return coreCount <= 1 ? 1 : coreCount - 1;
}