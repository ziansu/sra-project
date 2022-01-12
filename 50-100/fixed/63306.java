@java.lang.Override
public seedu.address.logic.commands.CommandResult execute() {
    if ((keywords) == null) {
        model.updateFilteredListToShowAllTasks();
        return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.ListCommand.MESSAGE_SUCCESS);
    }else
        if (keywords.contains(seedu.address.logic.commands.ListCommand.LIST_ALL)) {
            model.updateFilteredListToShowAllTasksAll();
            return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.ListCommand.MESSAGE_SUCCESS);
        }else
            if (!(isKeywordMatchingTaglist())) {
                return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.ListCommand.MESSAGE_LIST_DOES_NOT_EXIST);
            }else {
                model.updateFilteredTaskListGivenListName(keywords);
                return new seedu.address.logic.commands.CommandResult(formatter(keywords));
            }
        
    
}