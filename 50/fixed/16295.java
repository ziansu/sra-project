private engine.LocalFolder getDcim() {
    if ((mDcim) == null) {
        java.io.File root = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        mDcim = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
    }
    return mDcim;
}