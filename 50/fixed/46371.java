private void handleJobStatusEvent(org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJobStatusEvent event) {
    synchronized(jobsLock) {
        jobsSnapshot.addOrReplaceRunningJob(event.getJob());
        setChanged();
        notifyObservers(null);
    }
}