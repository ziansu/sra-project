public static void initializeLog(java.lang.String aLogPath) {
    try {
        java.io.File logFile = new java.io.File(aLogPath);
        if (!(logFile.exists())) {
            logFile.createNewFile();
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("ConfigurationCollection: Couldn't make log file out of xml path!");
    }
}