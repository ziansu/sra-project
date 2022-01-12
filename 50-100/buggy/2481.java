@java.lang.Override
public void onConfirmation(java.lang.String callerTag) {
    com.owncloud.android.ui.activity.ComponentsGetter cg = ((com.owncloud.android.ui.activity.ComponentsGetter) (getSherlockActivity()));
    com.owncloud.android.datamodel.FileDataStorageManager storageManager = cg.getStorageManager();
    if ((storageManager.getFileById(mTargetFile.getFileId())) != null) {
        java.lang.String path = new java.io.File(mTargetFile.getStoragePath()).getParent();
        cg.getFileOperationsHelper().removeFile(mTargetFile, false);
        triggerMediaScan(path);
    }
}