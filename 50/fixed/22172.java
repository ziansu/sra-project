private void saveCookies(javax.ws.rs.core.Response response) {
    java.util.Map<java.lang.String, javax.ws.rs.core.NewCookie> cookies = response.getCookies();
    if (cookies != null) {
        this.cookies.putAll(cookies);
    }
}