private static java.io.File getAppropriateStorageDir(final android.content.Context context) {
    java.io.File storageDir = com.example.nicco.inspectionReviewManager.FileIO.getExternalStorageDir();
    if (storageDir == null) {
        storageDir = com.example.nicco.inspectionReviewManager.FileIO.getInternalCachedStorageDir(context);
    }
    return storageDir;
}