public void setHandler(org.eclipse.jetty.server.Handler handler) {
    try {
        org.eclipse.jetty.server.Server server = getServer();
        if (handler != null)
            handler.setServer(server);
        
        updateBean(_handler, handler, true);
        _handler = handler;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}