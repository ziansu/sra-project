@com.google.common.eventbus.Subscribe
public void handleChangeStorageFilePathEvent(seedu.task.commons.events.storage.ChangeStorageFilePathEvent event) throws java.io.IOException {
    seedu.task.MainApp.logger.info(seedu.task.commons.core.LogsCenter.getEventHandlingLogMessage(event));
    config.setTaskManagerFilePath(event.toString());
    storage.setTaskManagerFilePath(event.toString());
    seedu.task.commons.util.ConfigUtil.saveConfig(config, config.DEFAULT_CONFIG_FILE);
    storage.saveTaskManager(model.getTaskManager(), event.toString());
}