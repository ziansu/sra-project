@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.hinohunomi.bgbeacon.BeaconService.TAG, "onBind");
    if ((mActionHandler) != null) {
        mActionHandler.sendEmptyMessage(com.hinohunomi.bgbeacon.BeaconService.ActionHandler.ACT_BEACON_DISABLE);
    }
    return mBinder;
}