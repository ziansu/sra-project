public void onServiceDisconnected(android.content.ComponentName className) {
    com.automatic.android.sdk.Automatic.mIsBound = false;
    com.automatic.android.sdk.Automatic.mService = null;
    android.util.Log.w(com.automatic.android.sdk.Automatic.TAG, "Disconnected.");
}