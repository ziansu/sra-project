@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    boolean isPushPluginActive = com.plugin.gcm.NotificationService.getInstance(getApplicationContext()).isActive();
    android.util.Log.v(com.plugin.gcm.PushHandlerActivity.TAG, ("onCreate - isPushPluginActive: " + isPushPluginActive));
    processPushBundle(isPushPluginActive);
    com.plugin.gcm.GCMIntentService.cancelNotification(this);
    if (!isPushPluginActive) {
        forceMainActivityReload();
    }
    finish();
}