@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.app_preferences);
    com.piotr.localweather.view.SettingsFragment.pref_location_key = getString(R.string.pref_location_key);
    com.piotr.localweather.view.SettingsFragment.cityEditTextPreference = ((android.preference.EditTextPreference) (findPreference("settings_edit_city_name")));
}