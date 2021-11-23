@java.lang.Override
public void stop() {
    android.content.BroadcastReceiver receiver;
    if (((batteryLevelReceiver) != null) && ((receiver = batteryLevelReceiver.get()) != null)) {
        service.unregisterReceiver(receiver);
        batteryLevelReceiver = null;
    }
}