@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if (preference == (this)) {
        setValues();
    }
    return true;
}