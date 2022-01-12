@java.lang.Override
protected void onDestroy() {
    if (isReady) {
        cn.smssdk.SMSSDK.unregisterAllEventHandler();
    }
    super.onDestroy();
}