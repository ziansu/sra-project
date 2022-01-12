@java.lang.Override
public void run() {
    if (!(java.lang.Thread.currentThread().isInterrupted())) {
        org.sleuthkit.autopsy.experimental.autoingest.AutoIngestMonitor.JobsSnapshot newJobsSnapshot = queryCoordinationService();
        synchronized(jobsLock) {
            jobsSnapshot = newJobsSnapshot;
            setChanged();
            notifyObservers(jobsSnapshot);
        }
    }
}