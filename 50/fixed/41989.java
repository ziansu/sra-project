private engine.LocalFolder getStorage() {
    if ((mStorage) == null) {
        java.io.File root = android.os.Environment.getExternalStorageDirectory();
        mStorage = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
    }
    return mStorage;
}