public void run() {
    long lastLogPurge = java.lang.System.nanoTime();
    while (running) {
        long nowNanos = java.lang.System.nanoTime();
        long nowMillis = java.lang.System.currentTimeMillis();
        scan(nowNanos, nowMillis, genericOperationRunners, genericCurrentOperationData);
        scan(nowNanos, nowMillis, partitionOperationRunners, partitionCurrentOperationData);
        if (purge(nowNanos, lastLogPurge)) {
            lastLogPurge = nowNanos;
        }
        if (running) {
            sleepInterval(nowNanos);
        }
    } 
}