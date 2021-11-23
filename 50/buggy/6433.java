@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mMyReceiver);
    unregisterReceiver(mSecondReceiver);
    mLocalBroadcastManager.unregisterReceiver(mThirdReceiver);
}