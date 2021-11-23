private static java.lang.String executeAdd(java.lang.String userCommand) {
    boolean isSuccess = true;
    tasknote.shared.TaskObject taskObject = tasknote.parser.Parser.parseAdd(userCommand, true);
    try {
    } catch (java.lang.Exception e) {
        isSuccess = false;
    }
    tasknote.logic.TaskNoteControl.command = new tasknote.logic.Commands.AddCommand(tasknote.logic.TaskNoteControl.taskNote, taskObject);
    tasknote.logic.TaskNoteControl.command.execute();
    tasknote.logic.TaskNoteControl.command.refreshDisplay();
    java.lang.String response = tasknote.logic.TaskNoteControl.command.getFeedBack();
    return response;
}