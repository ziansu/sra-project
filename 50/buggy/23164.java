public boolean contains(java.lang.String key) {
    android.content.SharedPreferences prefs = getSharedPreferences();
    boolean found = prefs.contains(key);
    return found;
}