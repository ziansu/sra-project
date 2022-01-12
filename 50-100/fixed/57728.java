public void setSilent(boolean silent) {
    this.silent = silent;
    for (java.lang.String s : org.apache.catalina.startup.Tomcat.silences) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(s);
        pinnedLoggers.put(s, logger);
        if (silent) {
            logger.setLevel(java.util.logging.Level.WARNING);
        }else {
            logger.setLevel(java.util.logging.Level.INFO);
        }
    }
}