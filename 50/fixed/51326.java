@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    context.unregisterReceiver(broadcastReceiver);
}