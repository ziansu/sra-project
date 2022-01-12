@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.e("rrrrrrrr", "");
    java.lang.String uuid = intent.getStringExtra("uuid");
    java.lang.String name = intent.getStringExtra("name");
    int rssi = intent.getIntExtra("rssi", 0);
    addDeviceInfo(name, uuid, rssi);
}