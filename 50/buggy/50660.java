public void beforeStart() {
    java.lang.String home = org.opencloudb.config.model.SystemConfig.getHomePath();
    org.opencloudb.Log4jInitializer.configureAndWatch((home + "/conf/log4j.xml"), org.opencloudb.MycatServer.LOG_WATCH_DELAY);
    org.opencloudb.config.ZkConfig.instance().initZk();
}