public void setHandler(org.eclipse.jetty.server.Handler handler) {
    if (handler == null)
        throw new java.lang.IllegalArgumentException("Parameter handler is null.");
    
    try {
        updateBean(_handler, handler, true);
        _handler = handler;
        org.eclipse.jetty.server.Server server = getServer();
        handler.setServer(server);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}