@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    utilities = new wtfisandroid.drinkinggamescollection.logic.Utilities(getApplicationContext());
    sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    currentLanguage = sharedPref.getString(Utilities.LANGUAGE_PREFERENCE_KEY, java.util.Locale.getDefault().getDisplayLanguage());
}