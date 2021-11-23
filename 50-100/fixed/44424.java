@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_notification);
    setHasOptionsMenu(true);
    android.os.AsyncTask<java.lang.Void, android.preference.Preference, java.lang.Void> settingsGetter;
    settingsGetter = new ha81dn.flashalert.SettingsActivity.NotificationPreferenceFragment.getSettings();
    settingsGetter.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}