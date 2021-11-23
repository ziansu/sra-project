@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((((intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) || (intent.getAction().equals(Intent.ACTION_SCREEN_ON))) || (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))) && (android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(SettingsActivity.PREF_KEY_OFF, true))) {
        start_lockscreen(context);
    }
}