@java.lang.Override
public android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) {
    if (receiver != null) {
        receivers.add(receiver);
    }
    return super.registerReceiver(receiver, filter);
}