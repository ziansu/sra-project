@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    if ((com.pixplicity.easyprefs.library.Prefs.getString(Constants.NAME, "").equals("")) || (com.pixplicity.easyprefs.library.Prefs.getString(Constants.REGION, "").equals(""))) {
        showInfoDialog();
    }else {
        initRiotApi();
        summonerInfoFragment(savedInstanceState);
    }
}