public boolean onPreferenceClick(android.preference.Preference preference) {
    if ((version_taps) == 3) {
        android.util.Log.d("Easter egg", "Activated");
        version_taps = 0;
    }else {
        (version_taps)++;
    }
    return true;
}