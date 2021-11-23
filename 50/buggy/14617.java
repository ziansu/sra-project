@java.lang.Override
protected void onPause() {
    super.onPause();
    intent.setAction(Constants.FINISH_COMMAND);
    sendBroadcast(intent);
    unregisterReceiver(mBroadcastReceiver);
}