private void cancelAllJobs() {
    cancelJob(fetchQStatInfoJob);
    cancelJob(fillTableJob);
    cancelJob(plotDataJob);
}