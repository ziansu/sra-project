public static void main(java.lang.String[] args) {
    scouter.util.logo.Logo.print(true);
    scouterx.webapp.main.WebAppMain.initializeLogDir();
    scouterx.webapp.configure.ConfigureAdaptor conf = scouterx.webapp.configure.ConfigureManager.getConfigure();
    scouterx.webapp.main.WebAppMain.connectScouterCollector();
    org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(conf.getNetHttpPort());
    scouterx.webapp.main.WebAppMain.setWebAppContext(server, true);
    try {
        server.start();
        scouterx.webapp.main.WebAppMain.waitOnExit(server);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}