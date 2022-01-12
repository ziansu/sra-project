@java.lang.Override
public void onStartedProcessing() {
    if ((submittedTime) == 0) {
        submittedTime = java.lang.System.nanoTime();
        origSubmission.onStartedProcessing();
    }
}