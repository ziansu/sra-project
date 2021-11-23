@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    java.lang.System.out.println(((("Fall service OnStartCommand received start id " + startId) + ": ") + intent));
    unipd.dei.ESP1415.falldetector.database.DbManager databaseManager = new unipd.dei.ESP1415.falldetector.database.DbManager(getApplicationContext());
    unipd.dei.ESP1415.falldetector.FallService.sessionID = databaseManager.getRunningSessionID();
    return START_STICKY;
}