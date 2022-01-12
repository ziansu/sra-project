@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    startForeground(notifMgr.getForegroundNotificationId(), notifMgr.getForegroundNotification());
    if ((((intent.getExtras()) != null) && (intent.getExtras().containsKey("booting"))) && ((java.lang.Boolean) (intent.getExtras().get("booting"))))
        startServices();
    
    return super.onStartCommand(intent, flags, startId);
}