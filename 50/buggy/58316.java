public void setFolderID(java.lang.String folderID, java.lang.String cloudService) {
    if (cloudService == "GoogleDrive") {
        googleDriveController.setFolderID(folderID);
    }
    if (cloudService == "Dropbox") {
    }
}