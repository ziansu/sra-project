public static org.eclipse.jetty.server.Server startServer(final java.lang.Integer webPort) throws java.lang.Exception {
    final org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(webPort);
    final org.eclipse.jetty.webapp.WebAppContext root = new org.eclipse.jetty.webapp.WebAppContext();
    root.setContextPath("/");
    root.setParentLoaderPriority(true);
    final java.lang.String webappDirLocation = "src/main/webapp/";
    root.setDescriptor((webappDirLocation + "/WEB-INF/web.xml"));
    root.setResourceBase(webappDirLocation);
    server.setHandler(root);
    server.start();
    server.join();
    return server;
}