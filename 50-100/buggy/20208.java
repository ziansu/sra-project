private boolean NeedToLog(android.location.Location loc) {
    java.util.List<com.mendhak.gpslogger.loggers.IFileLogger> loggers = com.mendhak.gpslogger.common.Session.getFileLoggers();
    boolean needToLog = false;
    for (com.mendhak.gpslogger.loggers.IFileLogger logger : loggers) {
        needToLog |= logger.isTimeToLog();
        needToLog |= logger.isDistToLog(loc.getLongitude(), loc.getLatitude());
    }
    com.mendhak.gpslogger.common.Utilities.LogInfo(("Need to log? " + (java.lang.String.valueOf(needToLog))));
    return needToLog;
}