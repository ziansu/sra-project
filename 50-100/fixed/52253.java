private void initEnv() {
    if ((reflections) == null) {
        reflections = new org.reflections.Reflections(new org.reflections.util.ConfigurationBuilder().setUrls(org.reflections.util.ClasspathHelper.forPackage(_scanPath)).addScanners(new org.reflections.scanners.FieldAnnotationsScanner()));
    }
    runnableExecutorServiceConcurrentMap = new java.util.concurrent.ConcurrentHashMap<>();
    moveStatusEntryBlockingDeque = new java.util.concurrent.LinkedBlockingDeque<>();
}