private static java.lang.String executeMarkAsComplete(java.lang.String userCommand) {
    int taskId = tasknote.parser.Parser.getUpdateTaskId(userCommand, true);
    tasknote.shared.TaskObject taskObject;
    if (tasknote.logic.TaskNoteControl.taskNote.isValidTaskId(taskId)) {
        java.util.ArrayList<tasknote.shared.TaskObject> displayList = tasknote.logic.TaskNoteControl.taskNote.getDisplayList();
        taskObject = displayList.get(taskId);
    }else {
        taskObject = null;
    }
    tasknote.logic.TaskNoteControl.command = new tasknote.logic.Commands.CompleteCommand(tasknote.logic.TaskNoteControl.taskNote, taskObject);
    tasknote.logic.TaskNoteControl.command.execute();
    tasknote.logic.TaskNoteControl.command.refreshDisplay();
    java.lang.String response = tasknote.logic.TaskNoteControl.command.getFeedBack();
    return response;
}