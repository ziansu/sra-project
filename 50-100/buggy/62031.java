@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String[] serviceList = com.red_folder.phonegap.plugin.backgroundservice.PropertyHelper.getBootServices(context);
    if (serviceList != null) {
        android.content.Intent serviceIntent = new android.content.Intent(context, com.neumob.cordova.networkstats.NetworkStatsService.class);
        context.startService(serviceIntent);
    }
}