public io.henry.devlogger.Session getSession(java.lang.String sessionKey) {
    io.henry.devlogger.Session s = sessionMap.get(sessionKey);
    if (s == null) {
        s = this.loggerEngine.getSession(sessionKey);
        if (s != null) {
            sessionMap.put(sessionKey, s);
        }
    }
    return s;
}