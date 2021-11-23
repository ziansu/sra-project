@java.lang.Override
public seedu.address.logic.commands.CommandResult execute() {
    seedu.address.commons.core.UnmodifiableObservableList<seedu.address.model.item.ReadOnlyItem> lastShownList = model.getFilteredItemList();
    if ((lastShownList.size()) < (targetIndex)) {
        indicateAttemptToExecuteIncorrectCommand();
        return new seedu.address.logic.commands.CommandResult(seedu.address.commons.core.Messages.MESSAGE_INVALID_ITEM_DISPLAYED_INDEX);
    }
    seedu.address.model.item.ReadOnlyItem itemToComplete = lastShownList.get(((targetIndex) - 1));
    if (itemToComplete.getIsDone()) {
        return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.DoneCommand.MESSAGE_DONE_ITEM_FAIL);
    }else {
        itemToComplete.setIsDone(true);
    }
    return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.DoneCommand.MESSAGE_DONE_ITEM_SUCCESS);
}