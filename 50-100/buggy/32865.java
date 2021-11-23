@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.v(codes.simen.calm.SilentService.logTag, "onCreate");
    audioManager = ((android.media.AudioManager) (getSystemService(codes.simen.calm.AUDIO_SERVICE)));
    notificationManager = ((android.app.NotificationManager) (getSystemService(codes.simen.calm.NOTIFICATION_SERVICE)));
    isAlternativeMuting = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean(MainActivity.SETTING_KEY_ALTERNATIVE_MUTING, false);
}