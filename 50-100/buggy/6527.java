public void copyFiles(android.view.View v) {
    com.smartstorage.mobile.db.DatabaseHandler db = com.smartstorage.mobile.db.DatabaseHandler.getDbInstance(context);
    for (int i = 0; i < (fileList.size()); i++) {
        com.smartstorage.mobile.db.FileDetails fileDetails = new com.smartstorage.mobile.db.FileDetails(fileList.get(i), "no_link_yet");
        db.addFileDetails(fileDetails);
        copyFileToGoogleDrive(fileList.get(i));
    }
}