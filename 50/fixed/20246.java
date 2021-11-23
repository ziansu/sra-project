public synchronized void put(final com.evernote.android.job.JobRequest request) {
    store(request);
    updateRequestInCache(request);
}