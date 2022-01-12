@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.v(com.plugin.gcm.PushHandlerActivity.TAG, "onCreate");
    boolean isPushPluginActive = com.plugin.gcm.PushPlugin.isActive();
    if (!isPushPluginActive) {
        forceMainActivityReload();
    }
    processPushBundle(isPushPluginActive);
    com.plugin.gcm.GCMIntentService.cancelNotification(this);
    finish();
}