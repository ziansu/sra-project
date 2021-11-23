private void updateSession(java.net.HttpURLConnection connection) {
    org.pageseeder.bridge.PSSession s = this.session;
    if (s != null) {
        s.update();
    }else {
        java.lang.String cookie = connection.getHeaderField("Set-Cookie");
        this.session = s = org.pageseeder.bridge.PSSession.parseSetCookieHeader(cookie);
    }
}