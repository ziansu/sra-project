private org.dsa.iot.dslink.handshake.RemoteHandshake generateHandshake(org.vertx.java.core.Handler<java.lang.Exception> errorHandler) {
    try {
        synchronized(this) {
            if (!(running)) {
                return null;
            }
        }
        org.dsa.iot.dslink.util.URLInfo auth = configuration.getAuthEndpoint();
        return org.dsa.iot.dslink.handshake.RemoteHandshake.generate(localHandshake, auth);
    } catch (java.lang.Exception e) {
        if (errorHandler != null) {
            errorHandler.handle(e);
        }
    }
    return null;
}