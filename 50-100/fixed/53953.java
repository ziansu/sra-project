public void start(int port, java.lang.String resourceBase) {
    server = new it.xpug.toolkit.http.Server(port);
    try {
        it.xpug.toolkit.http.HandlerList handlers = new it.xpug.toolkit.http.HandlerList();
        handlers.setHandlers(new it.xpug.toolkit.http.Handler[]{ new it.xpug.toolkit.http.ReusableJettyApp.StaticFilesHandler(resourceBase) , servletHandler() , new it.xpug.toolkit.http.DefaultHandler() });
        server.setHandler(handlers);
        server.start();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}