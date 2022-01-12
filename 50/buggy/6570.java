public static void setLogLevel(com.ikalagaming.logging.LogLevel newLevel) {
    if (!(com.ikalagaming.logging.Logging.initialized)) {
        com.ikalagaming.logging.Logging.create();
    }
    if (newLevel == null) {
        com.ikalagaming.logging.Logging.threshold = com.ikalagaming.logging.Logging.DEFAULT_THRESHOLD;
        return ;
    }
    synchronized(com.ikalagaming.logging.Logging.threshold) {
        com.ikalagaming.logging.Logging.threshold = newLevel;
    }
}