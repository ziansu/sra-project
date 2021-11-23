@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    try {
        unregisterReceiver(internetConnectionReceiver);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        stopSelf();
    }
}