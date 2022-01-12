private boolean startJettyServer(java.lang.String cmisWar, java.lang.Integer port) throws java.lang.Exception {
    this.server = new org.eclipse.jetty.server.Server(port);
    org.eclipse.jetty.webapp.WebAppContext webapp = new org.eclipse.jetty.webapp.WebAppContext();
    webapp.setContextPath("/cmis/");
    webapp.setWar(cmisWar);
    this.server.setHandler(webapp);
    this.server.start();
    return true;
}