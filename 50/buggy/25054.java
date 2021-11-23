@java.lang.Override
public void onFailed(java.lang.String reason) {
    toggleLoadingIndicator(false);
    loginFailedToast();
}