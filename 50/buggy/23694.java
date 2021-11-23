@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    setViewState();
    numUpdates = ((numUpdates)++) % 1440;
}