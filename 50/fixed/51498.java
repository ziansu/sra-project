@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((afterResult) || (hasLaunched)) {
        return ;
    }
    hasLaunched = true;
    launchAcquireIntent(acquisitionCode);
}