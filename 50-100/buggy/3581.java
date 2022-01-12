public void downloadFile() {
    java.lang.String selectedFile = guiController.getSelectedFile();
    try {
        fileserverHandler.downloadFile("s974489", selectedFile, ((java.lang.System.getProperty("user.dir")) + "\\"), UserPreferences.USERNAME, UserPreferences.PASSWORD);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}