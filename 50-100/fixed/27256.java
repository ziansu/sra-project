private void setupSimplePreferencesScreen() {
    if (!(edu.uw.informatics.brewsky.SettingsActivity.isSimplePreferences(this))) {
        return ;
    }
    addPreferencesFromResource(R.xml.pref_general);
    android.preference.PreferenceCategory fakeHeader = new android.preference.PreferenceCategory(this);
    fakeHeader.setTitle(R.string.pref_header_notifications);
    getPreferenceScreen().addPreference(fakeHeader);
    addPreferencesFromResource(R.xml.pref_notification);
}