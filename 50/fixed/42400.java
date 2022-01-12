@java.lang.Override
public void onError(org.datacleaner.job.tasks.Task task, java.lang.Throwable throwable) {
    try {
        org.datacleaner.job.concurrent.JobCompletionTaskListener.logger.debug("onError(...)");
        _analysisListener.errorUnknown(_analysisJobMetrics.getAnalysisJob(), throwable);
    } finally {
        _countDownLatch.countDown();
    }
}