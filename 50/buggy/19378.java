@java.lang.Override
public void onAdOpened() {
    super.onAdOpened();
    showThksToast();
    com.crashlytics.android.answers.Answers.getInstance().logCustom(new com.crashlytics.android.answers.CustomEvent("Click on ads"));
}