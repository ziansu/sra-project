@java.lang.Override
public void onStop() {
    unregisterReceiver(receiver);
    receiver = null;
    super.onStop();
}