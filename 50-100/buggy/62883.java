@java.lang.Override
public void onComplete(org.datacleaner.job.tasks.Task task) {
    org.datacleaner.job.concurrent.JobCompletionTaskListener.logger.debug("onComplete(...)");
    _countDownLatch.countDown();
    final int successCountDownStatus = _successCountDown.decrementAndGet();
    if (successCountDownStatus == 0) {
        _completionTime = new java.util.Date();
        _analysisListener.jobSuccess(_analysisJobMetrics.getAnalysisJob(), _analysisJobMetrics);
    }
}