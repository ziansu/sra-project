private engine.LocalFolder getDocuments() {
    try {
        if ((mDocuments) == null) {
            java.io.File root = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
            mDocuments = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
        }
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.dmitrymalkovich.fileexplorer.FileSystemImpl.LOG_TAG, "Exception, cannot get DIRECTORY_DOCUMENTS");
    }
    return mDocuments;
}