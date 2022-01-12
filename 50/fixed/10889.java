@java.lang.Override
protected void onStop() {
    android.util.Log.i(TAG, "onStopActivity");
    unReceiver();
    super.onStop();
}