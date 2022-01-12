@java.lang.Override
protected void onDestroy() {
    unregisterBroadCastReceivers();
    super.onDestroy();
}