public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.gmo.application.WebServerApp.LOG.info("---------------------------------------------");
    com.gmo.application.WebServerApp.LOG.info("--------START Emera Web APPLICATION----------");
    com.gmo.application.WebServerApp.LOG.info("---------------------------------------------");
    com.gmo.application.WebServerApp.logSystemProperties();
    com.gmo.application.WebServerApp.initConfigs();
    com.gmo.application.WebServerApp.initConnectionMonitor();
    com.gmo.application.WebServerApp.initRMIServers();
    com.gmo.application.WebServerApp.initJettyServer();
}