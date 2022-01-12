@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    java.lang.String action = intent.getAction();
    if (action.equals(com.owncloud.android.media.MediaService.ACTION_PLAY_FILE)) {
        processPlayFileRequest(intent);
    }else
        if (action.equals(com.owncloud.android.media.MediaService.ACTION_STOP_ALL)) {
            processStopRequest(true);
        }else
            if (action.equals(com.owncloud.android.media.MediaService.ACTION_STOP_FILE)) {
                processStopFileRequest(intent);
            }
        
    
    return START_NOT_STICKY;
}