@java.lang.Override
public void onDestroy() {
    unregisterReceiver(receiver);
    super.onDestroy();
}