private void appendAdditionalCookies(org.apache.http.client.CookieStore store, java.util.Map<java.lang.String, java.lang.String> cookies, java.lang.String domain, java.lang.String path, java.util.Date expiryDate) {
    cookies.forEach(( key, value) -> {
        org.apache.http.impl.cookie.BasicClientCookie cookie = new org.apache.http.impl.cookie.BasicClientCookie(key, value);
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookie.setExpiryDate(expiryDate);
        store.addCookie(cookie);
    });
}