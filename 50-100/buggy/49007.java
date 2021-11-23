@java.lang.Override
public void run() {
    android.content.SharedPreferences getPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    boolean isFirstStart = getPrefs.getBoolean("firstStart", true);
    if (true) {
        android.content.Intent i = new android.content.Intent(this, com.codephillip.intmain.fitracer.DefaultIntro.class);
        startActivity(i);
        android.content.SharedPreferences.Editor e = getPrefs.edit();
        e.putBoolean("firstStart", false);
        e.apply();
    }
}