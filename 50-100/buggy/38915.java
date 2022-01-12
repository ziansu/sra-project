private java.lang.String getCookieValue(org.apache.http.client.CookieStore cookieStore, java.lang.String cookieName) {
    java.lang.String value = null;
    for (org.apache.http.cookie.Cookie cookie : cookieStore.getCookies()) {
        if (cookie.getName().equals(cookieName)) {
            value = cookie.getValue();
            break;
        }
    }
    return value;
}