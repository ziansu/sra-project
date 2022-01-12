@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable r) {
    java.lang.Thread thread = new java.lang.Thread(r);
    thread.setName("MemoryCounter-Cleanup");
    thread.setDaemon(true);
    thread.setPriority(java.lang.Thread.MIN_PRIORITY);
    thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() {
        @java.lang.Override
        public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
            de.neofonie.cinderella.core.counter.FixedTimeMap.logger.error("Clean-Up Job in MemoryCounter fails, can result in OutOfMemory", e);
        }
    });
    return thread;
}