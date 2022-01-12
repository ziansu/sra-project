@java.lang.Override
public boolean onStartJob(android.app.job.JobParameters params) {
    com.crossbowffs.quotelock.utils.Xlog.i(com.crossbowffs.quotelock.app.QuoteDownloaderService.TAG, "Quote downloader job started");
    if ((params.getJobId()) != (com.crossbowffs.quotelock.utils.JobUtils.JOB_ID)) {
        com.crossbowffs.quotelock.utils.Xlog.e(com.crossbowffs.quotelock.app.QuoteDownloaderService.TAG, "Job ID mismatch, ignoring");
        return false;
    }
    if (isUpdateTooFrequent()) {
        com.crossbowffs.quotelock.utils.Xlog.w(com.crossbowffs.quotelock.app.QuoteDownloaderService.TAG, "Time elapsed since last update too short, ignoring");
        return false;
    }
    mUpdaterTask = new com.crossbowffs.quotelock.app.QuoteDownloaderService.ServiceQuoteDownloaderTask(params);
    mUpdaterTask.execute();
    return true;
}