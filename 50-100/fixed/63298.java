private final synchronized java.util.concurrent.ScheduledExecutorService getScheduledExecutor() {
    if ((scheduler) == null) {
        if ((baseThreadName) != null)
            scheduler = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(( r) -> new java.lang.Thread(r, (((baseThreadName) + "-") + (sequence.getAndIncrement()))));
        else
            scheduler = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        
    }
    return scheduler;
}