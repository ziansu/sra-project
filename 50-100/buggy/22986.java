@java.lang.Override
protected void onResume() {
    super.onResume();
    org.smap.smapTask.android.activities.MainTabsActivity.setupNFCDispatch(this, mNfcAdapter);
    if (!(listenerRegistered)) {
        android.content.IntentFilter filter = new android.content.IntentFilter();
        filter.addAction("startTask");
        filter.addAction("startMapTask");
        registerReceiver(listener, filter);
        listenerRegistered = true;
    }
}