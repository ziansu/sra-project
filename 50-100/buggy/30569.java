@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    if (PERMISSIONS_OK) {
        DEBUG = com.aware.Aware.getSetting(this, Aware_Preferences.DEBUG_FLAG).equals("true");
        com.aware.Aware.setSetting(this, Settings.STATUS_PLUGIN_HYKS, true);
        com.aware.Aware.startPlugin(this, "com.aware.plugin.hyks");
        com.aware.Aware.startAWARE(this);
    }
    return START_STICKY;
}