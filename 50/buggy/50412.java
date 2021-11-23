public int readPref(java.lang.String key, int value) {
    return me.wizos.loread.data.WithSet.mySharedPreferences.getInt(key, value);
}