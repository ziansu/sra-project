private boolean NeedToLog(android.location.Location loc) {
    java.util.List<com.mendhak.gpslogger.loggers.IFileLogger> loggers = com.mendhak.gpslogger.common.Session.getFileLoggers();
    boolean needToLog = false;
    for (com.mendhak.gpslogger.loggers.IFileLogger logger : loggers) {
        needToLog = logger.isTimeToLog();
        if (needToLog)
            needToLog &= logger.isDistToLog(loc.getLongitude(), loc.getLatitude());
        
        if (needToLog)
            return needToLog;
        
    }
    return needToLog;
}