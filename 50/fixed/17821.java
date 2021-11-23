private void addCookieMiddleware() {
    httpClient.insertMiddleware((cookieMiddleware = new com.koushikdutta.ion.cookie.CookieMiddleware(this)));
}