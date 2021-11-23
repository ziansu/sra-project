@java.lang.Override
public java.lang.String changeStorageFilePath(java.lang.String newFilePath) throws java.io.IOException, seedu.task.commons.events.ui.DisplayDirectoryChooserRequestEvent.DirectoryChooserOperationCancelledException {
    if (newFilePath.isEmpty()) {
        newFilePath = getNewFilePathFromDirectoryChooser();
    }
    newFilePath += "\\taskbook.xml";
    raise(new seedu.task.commons.events.storage.StorageFilePathChangedEvent(newFilePath, taskBook));
    seedu.task.commons.util.ConfigUtil.saveConfig(new seedu.task.commons.core.Config(newFilePath), Config.USER_CONFIG_FILE);
    return newFilePath;
}