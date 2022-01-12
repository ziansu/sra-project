public void setFilePath(java.lang.String userText) {
    this.saveTasksToFile();
    database.Database.setting.setFilepath(userText);
    database.Database.taskList.clear();
    new java.io.File(database.Database.setting.getDirectory()).mkdirs();
    database.Database.filepath = database.Database.setting.getFilepath();
    initFilePath();
    if ((this.fetchTasksFromFile()) && (this.saveTasksToFile())) {
        saveSettingsToFile();
    }else {
        database.Database.logger.error("Error changing filepath");
    }
}