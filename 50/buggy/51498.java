@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((afterResult) || (hasLaunched)) {
        finish();
        return ;
    }
    launchAcquireIntent(acquisitionCode);
}