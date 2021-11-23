@java.lang.Override
public void onComplete(org.datacleaner.job.tasks.Task task) {
    try {
        org.datacleaner.job.concurrent.JobCompletionTaskListener.logger.debug("onComplete(...)");
        final int successCountDownStatus = _successCountDown.decrementAndGet();
        if (successCountDownStatus == 0) {
            _completionTime = new java.util.Date();
            _analysisListener.jobSuccess(_analysisJobMetrics.getAnalysisJob(), _analysisJobMetrics);
        }
    } finally {
        _countDownLatch.countDown();
    }
}