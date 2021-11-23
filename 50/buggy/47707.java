private void startQStatService() {
    cancelJob(fetchQStatInfoJob);
    fetchQStatInfoJob.schedule();
    if (plotOption) {
        cancelJob(plotDataJob);
        plotDataJob.schedule();
    }
}