public boolean removeAll() {
    android.content.SharedPreferences.Editor prefsWriter = cookiePrefs.edit();
    prefsWriter.clear();
    prefsWriter.apply();
    cookies.clear();
    return true;
}