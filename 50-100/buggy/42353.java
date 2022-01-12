public long getIntegerPreValue(android.content.Context context, java.lang.String pref, int defVal) {
    if ((context == null) || (pref == null)) {
        return defVal;
    }
    android.content.SharedPreferences sharedPref = getSharedPreferences(context);
    if (sharedPref == null) {
        return defVal;
    }
    return sharedPref.getLong(pref, defVal);
}