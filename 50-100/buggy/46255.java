@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    java.lang.String preferenceKey = ((preference.getKey()) != null) ? preference.getKey() : "";
    if (preferenceKey.equals(getString(R.string.pref_key_passcode_toggle))) {
        return handlePasscodeToggleClick();
    }else
        if (preferenceKey.equals(getString(R.string.pref_key_change_passcode))) {
            return handleChangePasscodeClick();
        }
    
    return false;
}