@java.lang.Override
public void onDestroy() {
    unregisterReceiver(mLocationReceiver);
    mStopButton.performClick();
    super.onDestroy();
}