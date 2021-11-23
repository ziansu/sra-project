@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);
    android.preference.PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);
    initSummary(getPreferenceScreen());
}