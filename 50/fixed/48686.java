public java.lang.String getFolderID(java.lang.String cloudService) {
    java.lang.String folderID = "";
    if (cloudService.equals("GoogleDrive")) {
        folderID = googleDriveController.getFolderID();
    }
    if (cloudService.equals("Dropbox")) {
    }
    return folderID;
}