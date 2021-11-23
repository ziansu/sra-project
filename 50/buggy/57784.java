public boolean readPref(java.lang.String key, boolean defaultValue) {
    return me.wizos.loread.data.WithSet.mySharedPreferences.getBoolean(key, defaultValue);
}