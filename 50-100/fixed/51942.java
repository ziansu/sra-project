public void loadPreferences() {
    android.content.SharedPreferences sharedPreferences = android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(this);
    Vars.currentType = java.lang.Integer.parseInt(sharedPreferences.getString(getString(R.string.pref_mode_key), getString(R.string.default_home_mode)));
    Vars.language = sharedPreferences.getString(getString(R.string.pref_language_key), getString(R.string.l_english));
}