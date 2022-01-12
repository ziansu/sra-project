@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mSyncSubscription) != null) {
        mSyncSubscription.unsubscribe();
    }
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mRefreshReceiver);
}