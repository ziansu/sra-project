@java.lang.Override
public android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) {
    receivers.add(receiver);
    return super.registerReceiver(receiver, filter);
}