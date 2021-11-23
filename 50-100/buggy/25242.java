@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object value) {
    java.lang.String stringValue = value.toString();
    android.util.Log.d(com.loopcupcakes.udacity.sunshine.SettingsActivity.TAG, ("onPreferenceChange: " + stringValue));
    if (preference instanceof android.preference.ListPreference) {
        android.preference.ListPreference listPreference = ((android.preference.ListPreference) (preference));
        int index = listPreference.findIndexOfValue(stringValue);
        preference.setSummary((index >= 0 ? listPreference.getEntries()[index] : null));
    }else {
        preference.setSummary(stringValue);
    }
    return true;
}