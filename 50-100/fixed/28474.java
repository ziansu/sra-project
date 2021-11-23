@java.lang.Override
public seedu.task.logic.commands.CommandResult execute() {
    try {
        newSaveLocation = model.changeStorageFilePath(newSaveLocation);
    } catch (seedu.task.commons.events.ui.DisplayDirectoryChooserRequestEvent.DirectoryChooserOperationCancelledException e) {
        return new seedu.task.logic.commands.CommandResult(seedu.task.logic.commands.StoreCommand.MESSAGE_CANCEL_STORE_OPERATION);
    } catch (java.io.IOException e) {
        return new seedu.task.logic.commands.CommandResult(seedu.task.logic.commands.StoreCommand.MESSAGE_SAVE_CONFIG_FAIL);
    }
    return new seedu.task.logic.commands.CommandResult(java.lang.String.format(seedu.task.logic.commands.StoreCommand.MESSAGE_SUCCESS, newSaveLocation));
}