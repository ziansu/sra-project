@java.lang.Override
public void onCreate() {
    super.onCreate();
    mApplicationContext = getApplicationContext();
    new com.pixplicity.easyprefs.library.Prefs.Builder().setContext(mApplicationContext).setPrefsName(getPackageName()).setMode(com.hakerjack.crackthecodinginterview.MODE_PRIVATE).setUseDefaultSharedPreference(true).build();
    boolean isFirstTime = com.pixplicity.easyprefs.library.Prefs.getBoolean(SharedPrefsUtil.PREFS_KEY_IS_FIRST_TIME, true);
    if (isFirstTime) {
        setUpDatabaseData();
    }else {
        android.util.Log.i("KJ", "first time false");
    }
}