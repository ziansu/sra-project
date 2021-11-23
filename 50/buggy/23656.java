@java.lang.Override
protected void onStop() {
    super.onStop();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mNewLocationReceiver);
    if (mBound) {
        unbindService(mConnection);
    }
}