@java.lang.Override
public void onPause() {
    super.onDestroy();
    context.unregisterReceiver(broadcastReceiver);
}