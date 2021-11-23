@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minutesOfDay) {
    hour = hourOfDay;
    minutes = minutesOfDay;
    it.dei.unipd.esp1415.utils.PreferenceStorage.storeSimpleData(it.dei.unipd.esp1415.activity.SettingsActivity.context, it.dei.unipd.esp1415.activity.SettingsActivity.hourKey, ("" + (hour)));
    it.dei.unipd.esp1415.utils.PreferenceStorage.storeSimpleData(it.dei.unipd.esp1415.activity.SettingsActivity.context, it.dei.unipd.esp1415.activity.SettingsActivity.minutesKey, ("" + (minutes)));
    bindPreferenceSummaryToValue(findPreference("alarmtimekey"));
    setAlarm();
}