public static synchronized void init() {
    try {
        java.util.logging.FileHandler fh = new java.util.logging.FileHandler(((((com.mercury1089.util.Debug.PATH) + "log_") + (com.mercury1089.util.Debug.ISO8601.format(java.util.Calendar.getInstance().getTime()))) + ".txt"));
        com.mercury1089.util.Debug.LOGGER.setUseParentHandlers(false);
        fh.setFormatter(com.mercury1089.util.Debug.FORMATTER);
        com.mercury1089.util.Debug.LOGGER.addHandler(fh);
    } catch (java.lang.Exception e) {
    }
}