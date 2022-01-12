@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.pref_general);
    setHasOptionsMenu(true);
    ((com.teamagam.gimelgimel.app.settings.SettingsActivity) (getActivity())).bindPreferenceSummaryToValue(findPreference(getString(R.string.user_name_text_key)));
}