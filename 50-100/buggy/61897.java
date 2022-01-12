private void persistCookies() {
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.clear();
    for (java.util.Iterator<org.apache.http.cookie.Cookie> it = cookies.iterator(); it.hasNext();) {
        org.apache.http.cookie.Cookie cookie = it.next();
        editor.putString(java.lang.String.valueOf(i), org.droidparts.net.http.CookieJar.toString(cookie));
    }
    editor.commit();
}