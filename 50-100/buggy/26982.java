public void saveFile(java.util.ArrayList<application.storage.Task> list, java.lang.String filePath) {
    java.io.File f = new java.io.File(filePath);
    application.storage.FileManager.logger.log(java.util.logging.Level.INFO, "Saving file");
    if (!(f.exists())) {
        try {
            f.createNewFile();
            saveAllTasks(list, filePath);
        } catch (java.io.IOException e) {
            application.storage.FileManager.logger.log(java.util.logging.Level.SEVERE, "Error saving file");
        }
    }
}