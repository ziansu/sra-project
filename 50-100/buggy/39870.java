@java.lang.Override
public ICommand getCommand() {
    ICommand deleteCommand = new DeleteCommand(taskData, actualId);
    try {
        actualId = taskData.getActualId(taskId);
    } catch (java.lang.Exception NoSuchElementException) {
        java.lang.System.out.println(DeleteCommandHandler.messageUseDisplayFunction);
        return null;
    }
    boolean isExist = taskData.getEventMap().containsKey(actualId);
    if (isExist) {
        return deleteCommand;
    }
    return null;
}