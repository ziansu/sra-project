public synchronized void queueUpload(@android.support.annotation.NonNull
java.io.File file, @android.support.annotation.NonNull
java.lang.String key, com.amazonaws.services.s3.model.ObjectMetadata objectMetadata) {
    if (hasCredentials()) {
        uploadFile(key, file, (objectMetadata != null ? objectMetadata : new com.amazonaws.services.s3.model.ObjectMetadata()));
    }else {
        mUploadQueue.add(new com.perchlive.broadcast.sdk.api.s3.S3QueuedUploader.QueuedUpload(key, file, objectMetadata));
    }
}