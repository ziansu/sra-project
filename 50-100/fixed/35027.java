@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) || (intent.getAction().equals("android.intent.action.LOCKED_BOOT_COMPLETED"))) {
        android.util.Log.d(Config.LOG_TAG, "Received BOOT_COMPLETED Broadcast, Starting Service...");
        context.startService(new android.content.Intent(context, com.mathi_amorim.emmanuel.metrictime.UpdateTimeService.class));
        android.util.Log.d(Config.LOG_TAG, "Service Started");
    }
}