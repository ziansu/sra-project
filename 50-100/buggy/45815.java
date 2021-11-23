public static void setUpLogger() {
    java.util.logging.LogManager.getLogManager().reset();
    java.util.logging.Handler fh = null;
    try {
        fh = new java.util.logging.FileHandler("resources/log.txt");
    } catch (java.lang.SecurityException | java.io.IOException e) {
        e.printStackTrace();
    }
    java.util.logging.Formatter formatter = new logging.DatelessFormatter();
    java.util.logging.Logger.getLogger("").addHandler(fh);
    Main.Game.logger.setLevel(java.util.logging.Level.ALL);
    fh.setFormatter(formatter);
    Main.Game.logger.config("Date:");
}