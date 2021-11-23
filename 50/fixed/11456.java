@java.lang.Override
protected void onPause() {
    super.onPause();
    recordAudio(false);
    unregisterReceiver(mGattUpdateReceiver);
}