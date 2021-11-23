@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    com.example.antoine.settings.SettingsActivity.bindPreferenceSummaryToValueInt(findPreference("widget_color"));
}