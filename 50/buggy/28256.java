@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app = com.defch.blogwbly.MyApplication.getInstance(getActivity());
    addPreferencesFromResource(R.xml.settings);
    bindPreference(findPreference(SettingsActivity.THEME_KEY));
    findPreference(SettingsActivity.KEY_DARK_THEME).setOnPreferenceChangeListener(this);
}