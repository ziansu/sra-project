@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object value) {
    if (preference instanceof android.preference.EditTextPreference) {
        if (((((android.preference.EditTextPreference) (preference)).getEditText().getKeyListener().getInputType()) & (android.text.InputType.TYPE_CLASS_NUMBER)) != 0) {
            if ("".equals(java.lang.String.valueOf(value))) {
                return false;
            }
        }
    }
    updateSummary(preference, value);
    return true;
}