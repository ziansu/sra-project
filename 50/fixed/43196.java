public boolean removeAll() {
    cookies.clear();
    android.content.SharedPreferences.Editor prefsWriter = cookiePrefs.edit();
    prefsWriter.clear();
    prefsWriter.apply();
    return true;
}