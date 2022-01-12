private static synchronized android.content.SharedPreferences getSharedPrefs(android.content.Context context) {
    if ((com.magnet.mmx.client.api.MMX.sSharedPrefs) == null) {
        com.magnet.mmx.client.api.MMX.sSharedPrefs = context.getSharedPreferences(com.magnet.mmx.client.api.MMX.SHARED_PREFS_NAME, Context.MODE_PRIVATE);
    }
    return com.magnet.mmx.client.api.MMX.sSharedPrefs;
}