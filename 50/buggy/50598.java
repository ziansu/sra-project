@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    qwikstats.qwikcut.kerbysoft.com.qwikstats.SettingsActivity.bindPreferenceSummaryToValue(findPreference("example_text"));
    qwikstats.qwikcut.kerbysoft.com.qwikstats.SettingsActivity.bindPreferenceSummaryToValue(findPreference("example_list"));
}