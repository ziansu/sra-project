private void startMonitor() {
    if (mMonitoring.compareAndSet(false, true)) {
        if ((mRunningMonitor) == null) {
            mRunningMonitor = mThreadPoolManager.scheduleFixedRate(ThreadType.DECODER, mStateMonitor, 20, java.util.concurrent.TimeUnit.MILLISECONDS);
        }else {
            throw new java.lang.RuntimeException(("Channel state monitor's scheduled " + "future pointer was not null"));
        }
    }
}