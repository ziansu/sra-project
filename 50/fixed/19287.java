@java.lang.Override
public void onPause() {
    super.onPause();
    if (isReceiverRegistered) {
        unregisterReceiver(timerReceiver);
        isReceiverRegistered = false;
    }
}