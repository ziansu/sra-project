public boolean showFileUploadComponent() {
    if (((mode) == (edu.harvard.iq.dataverse.EditDatafilesPage.FileEditMode.UPLOAD)) || ((mode) == (edu.harvard.iq.dataverse.EditDatafilesPage.FileEditMode.CREATE))) {
        return true;
    }
    if (isFileReplaceOperation()) {
        return fileReplacePageHelper.showFileUploadComponent();
    }
    return false;
}