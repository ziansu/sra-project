@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.content.SharedPreferences.Editor editor = android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit();
    editor.putBoolean(com.mohammedsazid.android.launsz.v2.AppsService.FORCE_REFRESH, true);
    editor.commit();
    return START_STICKY;
}