@java.lang.Override
protected void onCancelled() {
    mAuthTask = null;
    showProgress(false, 0);
}