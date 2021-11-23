@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(com.epam.dmitriy_korobeinikov.task06_networking_3rd_party_libraries.receiver.RepositoryBroadcastReceiver.LOG_TAG, "onReceive");
    long checkFrequencyInMinutes = (java.lang.Long.parseLong(android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(SettingsActivity.PREF_CHECK_FREQUENCY_KEY, "0"))) * (android.text.format.DateUtils.MINUTE_IN_MILLIS);
    if (checkFrequencyInMinutes != 0) {
        startRepositoryCheckService(context);
        com.epam.dmitriy_korobeinikov.task06_networking_3rd_party_libraries.utils.AlarmManagerUtils.setupAlarmManager(context, checkFrequencyInMinutes, com.epam.dmitriy_korobeinikov.task06_networking_3rd_party_libraries.receiver.RepositoryBroadcastReceiver.getPendingIntent(context));
    }
}