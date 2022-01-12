public void setFilePath(java.lang.String userText) {
    this.saveTasksToFile();
    database.Database.setting.setFilepath(userText);
    database.Database.taskList.clear();
    database.Database.filepath = database.Database.setting.getFilepath();
    initFilePath();
    saveSettingsToFile();
    if ((this.fetchTasksFromFile()) && (this.saveTasksToFile())) {
        saveSettingsToFile();
    }else {
        database.Database.logger.error("Error changing filepath");
    }
}