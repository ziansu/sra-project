public void setFolderID(java.lang.String folderID, java.lang.String cloudService) {
    if (cloudService.equals("GoogleDrive")) {
        googleDriveController.setFolderID(folderID);
    }
    if (cloudService.equals("Dropbox")) {
    }
}