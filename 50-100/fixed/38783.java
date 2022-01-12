public void StopLogging() {
    com.mendhak.gpslogger.common.Utilities.LogDebug("GpsLoggingService.StopLogging");
    com.mendhak.gpslogger.common.Session.setAddNewTrackSegment(true);
    com.mendhak.gpslogger.common.Utilities.LogInfo("Stopping logging");
    closeLoggers();
    com.mendhak.gpslogger.common.Session.setStarted(false);
    StopGpsManager();
    AutoSendLogFileOnStop();
    CancelAlarm();
    com.mendhak.gpslogger.common.Session.setCurrentLocationInfo(null);
    stopForeground(true);
    RemoveNotification();
    StopAlarm();
    StopMainActivity();
}