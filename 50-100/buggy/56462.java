public void onOperationCompress() {
    if ((getSelectedFileList().size()) == 0) {
        return ;
    }
    com.openthos.filemanager.system.FileInfo file = getSelectedFileList().get(0);
    if (file == null) {
        return ;
    }
    com.openthos.filemanager.component.CompressDialog compressDialog = new com.openthos.filemanager.component.CompressDialog(mContext, file.filePath);
    compressDialog.showDialog();
    clearSelection();
}