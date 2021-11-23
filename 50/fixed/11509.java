@java.lang.Override
public void unregisterReceiver(android.content.BroadcastReceiver receiver) {
    if (receivers.contains(receiver)) {
        super.unregisterReceiver(receiver);
        receivers.remove(receiver);
    }
}