@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object value) {
    java.lang.String stringValue = value.toString();
    if (preference instanceof android.preference.ListPreference) {
        android.preference.ListPreference listPreference = ((android.preference.ListPreference) (preference));
        int prefIndex = listPreference.findIndexOfValue(stringValue);
        if (prefIndex >= 0) {
            preference.setSummary(listPreference.getEntries()[prefIndex]);
        }
        update(false);
    }else {
        preference.setSummary(stringValue);
        update(true);
    }
    return true;
}