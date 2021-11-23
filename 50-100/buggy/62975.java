@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.i("Log", "Checking ping");
    if ((me.johannesnz.smsim.Main.isConnected(context)) && (((java.lang.System.currentTimeMillis()) - (Main.lastPing)) > ((1000 * 60) * 15))) {
        me.johannesnz.smsim.Main.disconnect(context, "PING TIMEOUT");
    }
}