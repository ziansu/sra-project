@java.lang.Override
protected void onPause() {
    telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_NONE);
}