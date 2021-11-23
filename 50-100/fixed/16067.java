@java.lang.Override
public void onPause() {
    super.onPause();
    if ((mCountdownTimer) != null)
        mCountdownTimer.cancel();
    
    try {
        getApplicationContext().unregisterReceiver(mReceiver);
    } catch (java.lang.Exception e) {
    }
    try {
        getApplicationContext().unregisterReceiver(mProcessReceiver);
    } catch (java.lang.Exception e) {
    }
}