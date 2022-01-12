public void onServiceConnected(android.content.ComponentName className, android.os.IBinder binder) {
    myServiceBinder = ((com.repkap11.mobiquity.DropboxGetMetadataService.MyBinder) (binder)).getService();
    android.util.Log.i(com.repkap11.mobiquity.DropboxAwareFragment.TAG, "connected");
    if ((mNeedsUploadPath) != null) {
        uploadFileToDropbox(mNeedsUploadPath);
        mNeedsUploadPath = null;
    }
    if (mNeedsDownload) {
        mNeedsDownload = false;
        getDropboxMetadata("/");
    }
}