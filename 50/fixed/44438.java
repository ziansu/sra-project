@java.lang.Override
public void onItemDismissCallback(java.lang.String videoId) {
    com.application.letssound.managers.HistoryManager.getInstance(getContext()).removeFromHistory(videoId);
    if (videoId != null)
        new com.lib.lmn.davide.soundtrackdownloaderlibrary.manager.FileStorageManager(getContext(), null).deleteFileOnCache(videoId);
    
}