@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.i("Set", "setting");
    android.util.Log.i("Set", "setting");
    context.sendBroadcast(new android.content.Intent("NOTIFICATION_DISMISSED"));
}