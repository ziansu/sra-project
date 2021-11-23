@java.lang.Override
protected void onPause() {
    super.onPause();
    org.smap.smapTask.android.activities.MainTabsActivity.stopNFCDispatch(this, mNfcAdapter);
    if (listenerRegistered) {
        unregisterReceiver(listener);
        listenerRegistered = false;
    }
}