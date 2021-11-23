@java.lang.Override
public void onStartedProcessing() {
    numOfExecutingSubmissions.incrementAndGet();
    submittedTime = java.lang.System.nanoTime();
    origSubmission.onStartedProcessing();
}