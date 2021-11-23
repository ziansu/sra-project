private engine.LocalFolder getDcim() {
    if ((mDcim) == null) {
        java.io.File root = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        mDcim = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
        mDcim.setPredefinedThumbnail(R.drawable.ic_photo_camera_grey600_24dp);
    }
    return mDcim;
}