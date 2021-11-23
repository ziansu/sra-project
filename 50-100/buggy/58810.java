public void retrieveParsedCommand(java.lang.String originalDescription) {
    try {
        Parser.Command.COMMAND_TYPE typeCommand = null;
        Parser.Command existingCommand = Parser.CommandParser.getParsedCommand(originalDescription);
        typeCommand = getCommand(existingCommand);
        ScheduleHacks.Task getTaskToExecute = getTaskDescription(existingCommand);
        execute(typeCommand, existingCommand, getTaskToExecute);
        java.lang.System.out.println(4);
        autoChangeTaskStatus();
        storage.storeToFiles(getFloatingTasksToDo(), getFloatingTasksComplete(), getScheduledTasksToDo(), getScheduledTasksComplete(), getScheduledTasksOverDue());
    } catch (java.lang.Exception e) {
        setFeedBack(Logic.Logic.FEEDBACK_INVALID_COMMAND);
    }
}