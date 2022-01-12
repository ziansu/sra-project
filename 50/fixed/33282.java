private boolean isOnlineMode() {
    android.content.SharedPreferences settings = getSharedPreferences(com.computing.pervasive.myapplication.MainActivity.ONLINE_PREF, 0);
    return settings.getBoolean("ONLINE", false);
}