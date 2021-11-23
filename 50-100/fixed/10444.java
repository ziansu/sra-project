public void updateFilelist() {
    java.util.List<java.lang.String> fileList = new java.util.ArrayList<java.lang.String>();
    try {
        fileList = fileserverHandler.listFiles(UserPreferences.USERNAME, UserPreferences.USERNAME, UserPreferences.PASSWORD);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    guiController.eventUpdateFilelist(fileList);
}