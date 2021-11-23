@java.lang.Override
public final int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent != null)
        setupFirTask(intent);
    
    return android.app.Service.START_STICKY_COMPATIBILITY;
}