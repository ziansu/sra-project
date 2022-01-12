@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onDestroy");
    if ((mActionHandler) != null) {
        unregisterReceiver(broadcastReceiver);
        mActionHandler.abortBeacon();
    }
}