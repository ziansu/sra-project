@java.lang.Override
public void onSuccess(com.google.firebase.storage.StreamDownloadTask.TaskSnapshot taskSnapshot) {
    android.util.Log.d(com.google.firebase.quickstart.firebasestorage.MyDownloadService.TAG, "download:SUCCESS");
    broadcastDownloadFinished(downloadPath, taskSnapshot.getTotalByteCount());
    showDownloadFinishedNotification(downloadPath, ((int) (taskSnapshot.getTotalByteCount())));
    taskCompleted();
}