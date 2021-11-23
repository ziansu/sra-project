public void addCookie(java.lang.String key, javax.servlet.http.Cookie value) {
    cookies.putIfAbsent(key, value);
}