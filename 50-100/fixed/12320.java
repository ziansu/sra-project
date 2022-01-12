private static void setLogLevel(java.lang.String logLevel) {
    java.util.logging.Level level;
    try {
        level = java.util.logging.Level.parse(logLevel);
    } catch (java.lang.IllegalArgumentException e) {
        de.fosd.jdime.Main.LOG.warning(() -> "Invalid log level %s. Must be one of OFF, SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST or ALL.");
        return ;
    }
    java.util.logging.Logger root = java.util.logging.Logger.getLogger(de.fosd.jdime.Main.class.getPackage().getName());
    root.setLevel(level);
    for (java.util.logging.Handler handler : root.getHandlers()) {
        handler.setLevel(level);
    }
}