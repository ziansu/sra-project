@java.lang.Override
public seedu.address.logic.commands.CommandResult execute() {
    seedu.address.commons.core.UnmodifiableObservableList<seedu.address.model.item.ReadOnlyItem> lastShownList = model.getFilteredItemList();
    if ((lastShownList.size()) < (targetIndex)) {
        indicateAttemptToExecuteIncorrectCommand();
        return new seedu.address.logic.commands.CommandResult(seedu.address.commons.core.Messages.MESSAGE_INVALID_ITEM_DISPLAYED_INDEX);
    }
    seedu.address.model.item.ReadOnlyItem itemToDelete = lastShownList.get(((targetIndex) - 1));
    try {
        model.deleteItem(itemToDelete);
    } catch (seedu.address.model.item.UniqueItemList.ItemNotFoundException infe) {
        assert false : "The target item cannot be missing";
    }
    return new seedu.address.logic.commands.CommandResult(java.lang.String.format(seedu.address.logic.commands.DeleteCommand.MESSAGE_DELETE_ITEM_SUCCESS, itemToDelete));
}