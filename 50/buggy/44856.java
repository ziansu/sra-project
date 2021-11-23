public void createDirectory() {
    this.identifyDir();
    java.io.File filePath = new java.io.File(this.proposedPath);
    filePath.mkdirs();
    android.util.Log.d(neildg.com.eagleeyesr.io.DirectoryStorage.TAG, ("Image storage is set to: " + (proposedPath)));
}