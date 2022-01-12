public void start(java.lang.String propertyFile) throws java.lang.Exception {
    conf.PropertiesReader propertiesReader = new conf.PropertiesReader(propertyFile);
    com.google.inject.Injector injector = com.google.inject.Guice.createInjector(new PlaytestModule(propertiesReader));
    boolean useH2DB = propertiesReader.getBooleanProperty(Startup.USE_H2_DB, false);
    if (useH2DB) {
        startH2DBServer();
    }
    JettyServer jettyServer = injector.getInstance(JettyServer.class);
    servlet.PlaytestServlet playtestServlet = injector.getInstance(servlet.PlaytestServlet.class);
    startServer(jettyServer, propertiesReader, playtestServlet);
}