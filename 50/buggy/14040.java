@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference mute, java.lang.Object val) {
    java.lang.String newVal = ((java.lang.String) (val));
    uname.setSummary(newVal);
    return false;
}