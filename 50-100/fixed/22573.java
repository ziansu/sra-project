private void fixCheck() {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    android.preference.CheckBoxPreference checkBoxPref;
    checkBoxPref = ((android.preference.CheckBoxPreference) (findPreference(xtuaok.sharegyazo.GyazoPreference.PREF_SHARE_TEXT)));
    if (prefs.getBoolean(xtuaok.sharegyazo.GyazoPreference.PREF_OPEN_BROWSER, false)) {
        checkBoxPref.setEnabled(false);
    }
    checkBoxPref = ((android.preference.CheckBoxPreference) (findPreference(xtuaok.sharegyazo.GyazoPreference.PREF_OPEN_BROWSER)));
    if (prefs.getBoolean(xtuaok.sharegyazo.GyazoPreference.PREF_SHARE_TEXT, false)) {
        checkBoxPref.setEnabled(false);
    }
}