@java.lang.Override
public boolean onPreferenceChange(android.support.v7.preference.Preference preference, java.lang.Object value) {
    preference.setSummary(getDisplayValue(((net.xpece.android.support.preference.ListPreference) (preference)), value.toString()));
    scrapeAlarmManager.setAlarm(java.lang.Integer.parseInt(value.toString()));
    return true;
}