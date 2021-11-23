@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    final android.content.Context context = getContext();
    boolean changedSyncTime = key.equals(getString(R.string.pref_sync_time_key));
    if (changedSyncTime && (validateNewSyncTime(sharedPreferences, key))) {
        addSyncTimePreferenceSummary(sharedPreferences, key);
        pl.mosenko.sunnypodlaskie.util.WeatherDataAlarmSyncUtil.startAlarm(context);
    }
}