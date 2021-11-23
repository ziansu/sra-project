public void cancel() {
    java.lang.Runnable clo0 = clo;
    if ((clo0 != null) && (updater.compareAndSet(this, clo0, org.apache.ignite.internal.processors.query.GridQueryCancel.NO_OP))) {
        cancelRequested = true;
        waitForCancellableState();
        clo.run();
    }
}