@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UploadService.TAG, "uploadFromUri:onSuccess");
    android.net.Uri downloadUri = taskSnapshot.getMetadata().getDownloadUrl();
    broadcastUploadFinished(downloadUri, fileUri);
    taskCompleted();
}