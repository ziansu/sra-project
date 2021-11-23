public static void destroy() {
    java.io.File logFile = new java.io.File(com.goudagames.engine.logging.Log.path);
    if (logFile.exists()) {
        logFile.delete();
    }
}