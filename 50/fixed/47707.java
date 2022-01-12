private void startQStatService() {
    cancelJob(fetchQStatInfoJob);
    fetchQStatInfoJob.schedule();
}