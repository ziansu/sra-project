@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    at.fhhgb.catwalker.activity.SettingsActivity.controller.setView(((at.fhhgb.catwalker.activity.SettingsActivity) (this.getActivity())));
    addPreferencesFromResource(R.xml.pref_settings);
    at.fhhgb.catwalker.activity.SettingsActivity.bindPreferenceSummaryToValue(findPreference("notifications_new_message_ringtone"));
    at.fhhgb.catwalker.activity.SettingsActivity.controller.bindUsernameToValue(findPreference("settings_username"));
    at.fhhgb.catwalker.activity.SettingsActivity.controller.bindUniversityListToValue(((android.preference.ListPreference) (findPreference("settings_university"))));
}