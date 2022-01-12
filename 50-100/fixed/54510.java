@java.lang.Override
public void run() {
    int count = getMaxBatchSize();
    while ((deferralNeeded.get()) && (count > 0)) {
        count--;
        deferralNeeded.set(false);
        try {
            java.lang.Thread.sleep(getDeferMillis());
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.RuntimeException("ERROR", e);
        }
    } 
    processBatch();
    inProcess.set(false);
}