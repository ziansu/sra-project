private void loadSettings() {
    android.content.SharedPreferences settingsPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    appEnabled = settingsPrefs.getBoolean("pref_enableMCA", false);
    replaceNumbersWithText = settingsPrefs.getBoolean("pref_useWordsForNumbers", false);
    callImmediatelyWhenClicked = settingsPrefs.getBoolean("pref_callbackOption", true);
    includeNumbersInSMS = settingsPrefs.getBoolean("pref_includeNumber", true);
    blockOperatorAds = settingsPrefs.getBoolean("pref_blockAds", true);
}