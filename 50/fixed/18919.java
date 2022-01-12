public void cancel() {
    cancelRequested = true;
    waitForCancellableState();
    java.lang.Runnable clo0 = clo;
    if (updater.compareAndSet(this, clo0, org.apache.ignite.internal.processors.query.GridQueryCancel.NO_OP))
        clo0.run();
    
}