public static void unRegisterBluetoothBroadcast(android.content.Context context) {
    context.unregisterReceiver(com.bytereal.byterealblesdk.broadcast.register.RegisteredBroadcast.bluetoothBroadcastReceiver);
    com.bytereal.byterealblesdk.broadcast.register.RegisteredBroadcast.ILOG("broadcastreceiver unregistered!");
}