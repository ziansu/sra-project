private void initBroadcastPushFormConfig() {
    try {
        android.content.Context context = com.pushwoosh.module.TiApplication.getInstance();
        android.content.pm.ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
        if ((ai != null) && ((ai.metaData) != null)) {
            broadcastPush = ai.metaData.getBoolean("PW_BROADCAST_PUSH", true);
        }
    } catch (java.lang.Exception e) {
        org.appcelerator.kroll.common.Log.e(com.pushwoosh.module.PushnotificationsModule.LCAT, "Failed to read AndroidManifest metaData", e);
    }
}