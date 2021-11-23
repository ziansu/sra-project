@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (((java.lang.System.currentTimeMillis()) - (Main.lastPing)) > 60000) {
        me.johannesnz.smsim.Main.getInstance().connFail();
    }
}