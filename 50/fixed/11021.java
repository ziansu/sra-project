public static java.lang.String getUserName(android.content.Context c) {
    android.content.SharedPreferences pref = c.getSharedPreferences(ru.meefik.linuxdeploy.PrefStore.getCurrentProfile(c), Context.MODE_PRIVATE);
    return pref.getString("username", c.getString(R.string.username)).trim();
}