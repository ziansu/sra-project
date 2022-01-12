private static org.eclipse.jetty.server.handler.ContextHandler createContextWebDownload() {
    org.eclipse.jetty.server.handler.ContextHandler contextHandler = new org.eclipse.jetty.server.handler.ContextHandler(((tsdb.TsDBFactory.WEB_SERVER_PREFIX_BASE_URL) + (tsdb.web.Main.DOWNLOAD_PART_URL)));
    org.eclipse.jetty.server.handler.ResourceHandler resourceHandler = new org.eclipse.jetty.server.handler.ResourceHandler();
    resourceHandler.setStopTimeout(tsdb.web.Main.FILE_DOWNLOAD_TIMEOUT_MILLISECONDS);
    resourceHandler.setMinAsyncContentLength((-1));
    resourceHandler.setDirectoriesListed(false);
    resourceHandler.setResourceBase(TsDBFactory.WEBDOWNLOAD_PATH);
    org.eclipse.jetty.server.handler.HandlerList handlers = new org.eclipse.jetty.server.handler.HandlerList();
    handlers.setHandlers(new org.eclipse.jetty.server.Handler[]{ resourceHandler , new org.eclipse.jetty.server.handler.DefaultHandler() });
    contextHandler.setHandler(handlers);
    return contextHandler;
}