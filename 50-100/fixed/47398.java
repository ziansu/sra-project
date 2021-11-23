@java.lang.Override
protected seedu.taskmanager.commons.core.Config initConfig(java.lang.String configFilePath) {
    seedu.taskmanager.commons.core.Config config = super.initConfig(configFilePath);
    config.setAppTitle(seedu.taskmanager.TestApp.APP_TITLE);
    config.setTaskManagerFilePath(saveFileLocation);
    config.setUserPrefsFilePath(seedu.taskmanager.TestApp.DEFAULT_PREF_FILE_LOCATION_FOR_TESTING);
    config.setTaskManagerName(seedu.taskmanager.TestApp.TASK_MANAGER_NAME);
    return config;
}