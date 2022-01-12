private org.eclipse.jetty.server.handler.ContextHandler setupHandlers() {
    org.eclipse.jetty.server.handler.ContextHandler ctxServer = new org.eclipse.jetty.server.handler.ContextHandler();
    ctxServer.setContextPath("/");
    mInternauta.Nermis.Web.nWebDefaultHandler mainHandler = new mInternauta.Nermis.Web.nWebDefaultHandler(this.webServerPath);
    mainHandler.addMapping("/status.do", new mInternauta.Nermis.Web.nServicePageHandler());
    mainHandler.addMapping("/charts.do", new mInternauta.Nermis.Web.nServiceChartsHandler());
    ctxServer.setWelcomeFiles(new java.lang.String[]{ "index.html" });
    ctxServer.setHandler(mainHandler);
    return ctxServer;
}