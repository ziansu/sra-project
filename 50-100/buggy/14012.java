private static java.lang.String executeDelete(java.lang.String userCommand) {
    java.util.ArrayList<java.lang.Integer> deleteIds = tasknote.parser.Parser.parseDelete(userCommand);
    tasknote.logic.TaskNoteControl.command = new tasknote.logic.Commands.DeleteCommand(tasknote.logic.TaskNoteControl.taskNote, deleteIds);
    tasknote.logic.TaskNoteControl.command.execute();
    tasknote.logic.TaskNoteControl.command.refreshDisplay();
    java.lang.String response = tasknote.logic.TaskNoteControl.command.getFeedBack();
    return response;
}