@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    int startOption = START_NOT_STICKY;
    if (intent == null) {
        return startOption;
    }
    int mapID = intent.getIntExtra(appConstants.DOWNLOAD_INTENT_NAME, 0);
    if (((activeDownloadsList[mapID]) != null) && (activeDownloadsList[mapID])) {
        com.noveogroup.android.log.Log.d("Duplicate download request for the same map type");
        return startOption;
    }
    activeDownloadsList[mapID] = true;
    downloadMap(mapID);
    return startOption;
}