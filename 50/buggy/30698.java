private java.lang.Thread startInNewThreadAndClassloader(java.lang.Runnable runnable, java.lang.String zookeeper) {
    java.lang.Thread thread = new java.lang.Thread(runnable);
    thread.setContextClassLoader(io.eventStreamAnalytics.test.IntegrationTest.SYSTEM_CLASS_LOADER);
    thread.setName(zookeeper);
    thread.start();
    return thread;
}