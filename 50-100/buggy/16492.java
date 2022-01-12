public void stop() {
    synchronized(this) {
        if (!(mStopped)) {
            mLoggingWorkerThread.interrupt();
            try {
                mLoggingWorkerThread.join();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
            } finally {
                mStopped = true;
                mLoggingWorkerThread = null;
                alluxio.master.audit.AsyncUserAccessAuditLogWriter.LOG.info("AsyncUserAccessAuditLogWriter thread stopped.");
            }
        }
    }
}