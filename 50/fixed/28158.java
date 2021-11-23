@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    super.onDialogClosed(positiveResult);
    if (positiveResult) {
        mApi.logout();
    }
}