private void updateByPriorityLevel(seedu.address.model.Task.Priority priority) {
    if ((this.priority.toString()) == (seedu.address.logic.commands.FindCommand.HIGH_PRIORITY)) {
        model.updateFilteredTaskListByHighPriority();
    }else
        if ((this.priority.toString()) == (seedu.address.logic.commands.FindCommand.MEDIUM_PRIORITY)) {
            model.updateFilteredTaskListByMediumPriority();
        }else
            if ((this.priority.toString()) == (seedu.address.logic.commands.FindCommand.LOW_PRIORITY)) {
                model.updateFilteredTaskListByLowPriority();
            }else {
                org.junit.Assert.fail("unable to execute FindCommand due to incorrect Priority");
            }
        
    
}