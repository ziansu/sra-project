@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_sync);
    setHasOptionsMenu(true);
    com.rbk.testapp.SettingsActivity.bindPreferenceSummaryToValue(findPreference("pref_when2sync"));
    com.rbk.testapp.SettingsActivity.bindPreferenceSummaryToValue(findPreference("pref_homewifissid"));
    android.preference.CheckBoxPreference checkBoxPreference = new android.preference.CheckBoxPreference(getActivity());
    checkBoxPreference.setKey("pref_directory_3");
    checkBoxPreference.setTitle("/mnt/sdcard0/DCIM");
    android.preference.PreferenceScreen targetScreen = ((android.preference.PreferenceScreen) (findPreference("pref_local_dirs_screen")));
    targetScreen.addPreference(checkBoxPreference);
}