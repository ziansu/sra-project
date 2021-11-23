@java.lang.Override
public void run() {
    if (isInCommingCall) {
        stopIncomeCallTimer();
        android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, ("isInCommingCall - " + (isInCommingCall)));
    }
    com.quickblox.sample.videochatwebrtcnew.SessionManager.setCurrentSession(null);
    android.util.Log.d(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TAG, "Stop session");
    stopTimer();
    closeByWifiStateAllow = true;
    if (!(isWifiConnected)) {
        processCurrentWifiState(this);
    }else {
        finish();
    }
}