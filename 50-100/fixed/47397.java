@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object value) {
    java.lang.String stringValue = value.toString();
    if (preference instanceof android.preference.ListPreference) {
        android.preference.ListPreference listPreference = ((android.preference.ListPreference) (preference));
        int index = listPreference.findIndexOfValue(stringValue);
        if (index >= 0) {
            preference.setSummary(listPreference.getEntries()[index]);
        }
    }else {
        preference.setSummary(stringValue);
    }
    return true;
}