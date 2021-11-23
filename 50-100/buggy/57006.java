public void onOperationButtonCancel() {
    mFileOperationHelper.clear();
    if (isSelectingFiles()) {
        mSelectFilesCallback.selected(null);
        mSelectFilesCallback = null;
        clearSelection();
    }else
        if (mFileOperationHelper.isMoveState()) {
            mFileOperationHelper.EndMove(null);
            refreshFileList();
        }else {
            refreshFileList();
        }
    
}