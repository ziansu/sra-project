@java.lang.Override
public void unregisterReceiver(android.content.BroadcastReceiver receiver) {
    super.unregisterReceiver(receiver);
    receivers.remove(receiver);
}