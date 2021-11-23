public void showProgress(@android.support.annotation.NonNull
java.lang.String progressMessage) {
    mInProgress = true;
    mStepperFeedbackType.showProgress(progressMessage);
}