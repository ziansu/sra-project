@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    try {
        com.app.lifeshare.Utils.LogUtils.showErrorLog(("UpdateUserLatLongStatus" + "onDestroy() called"));
        unregisterReceiver(internetConnectionReceiver);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        stopSelf();
    }
}