public void onOperationButtonCancel() {
    mFileOperationHelper.clear();
    if (isSelectingFiles()) {
        mSelectFilesCallback.selected(null);
        mSelectFilesCallback = null;
    }else
        if (mFileOperationHelper.isMoveState()) {
            mFileOperationHelper.EndMove(null);
            refreshFileList();
        }else {
            refreshFileList();
        }
    
}