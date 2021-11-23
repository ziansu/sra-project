public void copyFiles(android.view.View v) {
    com.smartstorage.mobile.db.DatabaseHandler db = com.smartstorage.mobile.db.DatabaseHandler.getDbInstance(context);
    for (int i = 0; i < (fileList.size()); i++) {
        copyFileToGoogleDrive(fileList.get(i));
    }
}