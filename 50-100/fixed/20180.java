@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);
    moe.haruue.wadb.presenter.Commander.addChangeListener(listener);
    moe.haruue.wadb.presenter.Commander.addFailureListener(listener);
    android.preference.PreferenceManager.setDefaultValues(getActivity(), R.xml.preferences, false);
    wadbSwitchPreference = ((android.preference.SwitchPreference) (findPreference("pref_key_wadb_switch")));
    portPreference = ((android.preference.EditTextPreference) (findPreference("pref_key_wadb_port")));
    moe.haruue.wadb.presenter.Commander.checkWadbState();
}