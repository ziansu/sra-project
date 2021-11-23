public void onOperationInfo() {
    if ((getSelectedFileList().size()) == 0)
        return ;
    
    com.openthos.filemanager.system.FileInfo file = getSelectedFileList().get(0);
    if (file == null)
        return ;
    
    com.openthos.filemanager.component.PropertyDialog propertyDialog = new com.openthos.filemanager.component.PropertyDialog(mContext, file.filePath);
    propertyDialog.showDialog();
    clearSelection();
}