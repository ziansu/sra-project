public void startProgress(java.lang.String filename, li.itcc.flypostr.util.ImageLoader.ImageLoaderCallback callback) {
    this.callback = callback;
    this.filename = filename;
    com.google.firebase.storage.StorageReference storageRef = com.google.firebase.storage.FirebaseStorage.getInstance().getReference(pathToStorageFolder);
    try {
        tmpFile = new java.io.File(context.getCacheDir(), filename);
        task = storageRef.child(filename).getFile(tmpFile);
        task.addOnSuccessListener(this);
        task.addOnProgressListener(this);
    } catch (java.lang.Exception e) {
        callback.onError(e);
    }
}