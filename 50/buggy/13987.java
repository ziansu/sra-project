@java.lang.Override
protected void onPause() {
    locManager.removeUpdates(locListener);
    locListener = null;
    super.onPause();
}