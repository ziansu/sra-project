private void notifyAlarm(android.app.Notification n) {
    mNotificationManager.notify(com.darshancomputing.BatteryIndicatorPro.BatteryInfoService.NOTIFICATION_ALARM, n);
    if ((n.audioStreamType) == (android.media.AudioManager.STREAM_ALARM))
        playAlarmMyself(n.sound);
    
}