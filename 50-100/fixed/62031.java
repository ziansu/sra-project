@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String[] serviceList = com.red_folder.phonegap.plugin.backgroundservice.PropertyHelper.getBootServices(context);
    if (serviceList != null) {
        for (int i = 0; i < (serviceList.length); i++) {
            android.content.Intent serviceIntent = new android.content.Intent(serviceList[i]);
            context.startService(serviceIntent);
        }
    }
}