@java.lang.Override
public void onNeedFillSubmission(org.stepic.droid.model.Submission submission, int numberOfSubmissions) {
    enableInternetMessage(false);
    showActionButtonLoadState(false);
    showAnswerField(true);
    showActionButtonLoadState(false);
    this.numberOfSubmissions = numberOfSubmissions;
    this.submission = submission;
    saveSession(false);
    fillSubmission(submission);
}