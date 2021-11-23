@java.lang.Override
protected void onPause() {
    android.util.Log.i(com.hydraproductions.cicada.PhoneStatus.TAG, "ON PAUSE");
    telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_NONE);
}