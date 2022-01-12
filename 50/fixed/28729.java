@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    return net.anei.cadpage.ManagePreferences.checkNoShowInCall(((android.preference.CheckBoxPreference) (preference)), ((java.lang.Boolean) (newValue)));
}