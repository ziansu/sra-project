@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_notification);
    setHasOptionsMenu(true);
    ha81dn.flashalert.DatabaseHandler log = new ha81dn.flashalert.DatabaseHandler(getActivity());
    log.addLogEntry("test", "test", "irgendwas");
    log.hasFlashedRecently(30);
    log.equalsRecentNotification("test", "test", 30);
    log.close();
    android.os.AsyncTask<java.lang.Void, android.preference.Preference, java.lang.Void> settingsGetter;
    settingsGetter = new ha81dn.flashalert.SettingsActivity.NotificationPreferenceFragment.getSettings();
    settingsGetter.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}