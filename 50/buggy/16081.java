public void clearCookieStore() {
    java.util.List<org.apache.http.cookie.Cookie> cookies = cookieStore.getCookies();
    for (org.apache.http.cookie.Cookie cookie : cookies) {
        cookieStore.deleteCookie(cookie);
    }
    cookieStore.clear();
}