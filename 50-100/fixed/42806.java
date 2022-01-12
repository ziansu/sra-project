private static org.eclipse.jetty.server.handler.ContextHandler createContextExport(tsdb.remote.RemoteTsDB tsdb) {
    org.eclipse.jetty.server.handler.ContextHandler contextExport = new org.eclipse.jetty.server.handler.ContextHandler(((tsdb.TsDBFactory.WEB_SERVER_PREFIX_BASE_URL) + (tsdb.web.Main.EXPORT_API_PART_URL)));
    tsdb.web.api.TsDBExportAPIHandler exportHandler = new tsdb.web.api.TsDBExportAPIHandler(tsdb);
    org.eclipse.jetty.server.session.HashSessionManager manager = new org.eclipse.jetty.server.session.HashSessionManager();
    manager.setMaxInactiveInterval(tsdb.web.Main.EXPORT_API_SESSION_TIMEOUT_SECONDS);
    org.eclipse.jetty.server.session.SessionHandler sessions = new org.eclipse.jetty.server.session.SessionHandler(manager);
    contextExport.setHandler(sessions);
    sessions.setHandler(exportHandler);
    return contextExport;
}