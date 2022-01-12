private seedu.todo.commons.core.Config updateConfigByName(seedu.todo.commons.core.Config config, java.lang.String configName, java.lang.String configValue) {
    switch (configName) {
        case "appTitle" :
            seedu.todo.ui.UiManager.getInstance().getMainWindow().setTitle(configValue);
            config.setAppTitle(configValue);
            break;
        case "databaseFilePath" :
            boolean hasMoved = seedu.todo.models.TodoListDB.getInstance().move(configValue);
            if (!hasMoved) {
                failWithMessage(seedu.todo.controllers.ConfigController.MESSAGE_FAILURE_DBFILEPATH);
                break;
            }
            config.setDatabaseFilePath(configValue);
            break;
    }
    return config;
}