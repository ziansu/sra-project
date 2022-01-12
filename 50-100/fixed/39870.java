@java.lang.Override
public ICommand getCommand() {
    try {
        actualId = taskData.getActualId(taskId);
    } catch (java.lang.Exception NoSuchElementException) {
        java.lang.System.out.println(DeleteCommandHandler.messageUseDisplayFunction);
        return null;
    }
    boolean isExist = taskData.getEventMap().containsKey(actualId);
    if (isExist) {
        ICommand deleteCommand = new DeleteCommand(taskData, actualId);
        return deleteCommand;
    }
    return null;
}