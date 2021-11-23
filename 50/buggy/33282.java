private boolean isOnlineMode() {
    android.content.SharedPreferences settings = getSharedPreferences(com.computing.pervasive.myapplication.MainActivity.ONLINE_PREF, 0);
    boolean online = settings.getBoolean("ONLINE", false);
    return online;
}