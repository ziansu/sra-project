private final synchronized java.util.concurrent.ScheduledExecutorService getScheduledExecutor() {
    if ((scheduler) == null) {
        if ((baseThreadName) != null)
            scheduler = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory() {
                @java.lang.Override
                public java.lang.Thread newThread(final java.lang.Runnable r) {
                    return new java.lang.Thread(r, (((baseThreadName) + "-") + (sequence.getAndIncrement())));
                }
            });
        else
            scheduler = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        
    }
    return scheduler;
}