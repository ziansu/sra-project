private static void getSharedPreferences(com.android.settings.notification.Context context, com.android.settings.notification.Intent intent) {
    java.lang.String appName = intent.getStringExtra("com.android.systemui.appname");
    int appId = intent.getIntExtra("com.android.systemui.appID");
    if ((appName != (NULL)) && (appId != (NULL))) {
        com.android.settings.notification.Intent sendPref = new com.android.settings.notification.Intent();
        sendPref.setAction("com.android.settings.sendPref");
        sendPref.putExtra("com.android.settings.preferenceflag", 1);
        context.sendBroadcast(sendPref);
    }
}