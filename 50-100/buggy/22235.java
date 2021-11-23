@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(getContext().getString(R.string.key_phoneNo))) {
        android.support.v7.preference.EditTextPreference phoneNoPref = ((android.support.v7.preference.EditTextPreference) (findPreference(key)));
        java.lang.String phoneNo = phoneNoPref.getText();
        phoneNoPref.setSummary(phoneNo);
        sharedPreferences.edit().putString(getString(R.string.keyValue_phoneNo), phoneNo).apply();
    }
}