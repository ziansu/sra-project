public static <T> void d(java.lang.String tag, java.lang.String msg) throws java.lang.NullPointerException {
    com.johnnyc.dblog.DBLog.logToLogcat(LogLevel.DEBUG, tag, msg);
    if (com.johnnyc.dblog.DBLog.Configuration.getLevelsToLog().contains(LogLevel.VERBOSE)) {
        com.johnnyc.dblog.DBLog.getInstance().addLog(LogLevel.VERBOSE, null, tag, msg, null);
    }
}