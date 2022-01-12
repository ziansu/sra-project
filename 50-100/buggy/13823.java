private void checkStartSetup() {
    android.content.SharedPreferences settings = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    boolean startSetup = settings.getBoolean("startSetup", false);
    if (startSetup == false) {
        android.content.Intent nextScreen = new android.content.Intent(getApplicationContext(), de.nkp_media.vertretungsplanappandroid.Setup.class);
        startActivity(nextScreen);
    }
}