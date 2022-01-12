public void extendSession(java.lang.String sessionId) throws org.pi.litepost.databaseAccess.DatabaseCriticalErrorException {
    fi.iki.elonen.NanoHTTPD.Cookie cookie = new fi.iki.elonen.NanoHTTPD.Cookie("sessionId", sessionId, 30);
    java.time.LocalDateTime expiration = java.time.LocalDateTime.now().plusDays(30);
    model.getQueryManager().executeQuery("updateSessionVar", sessionId, "expiration", expiration);
    cookies.set(cookie);
}