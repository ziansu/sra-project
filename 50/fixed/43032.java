@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    int position = (java.lang.Integer.parseInt(newValue.toString())) - 1;
    preference.setSummary(arrayValues[position]);
    return true;
}