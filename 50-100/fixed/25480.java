private static java.lang.String executeChangeFilePath(java.lang.String userCommand) {
    java.lang.String filePath = tasknote.parser.Parser.parseFilePath(userCommand, true);
    tasknote.logic.TaskNoteControl.command = new tasknote.logic.Commands.ChangeFilePathCommand(tasknote.logic.TaskNoteControl.taskNote, filePath);
    tasknote.logic.TaskNoteControl.command.execute();
    tasknote.logic.TaskNoteControl.command.refreshDisplay();
    java.lang.String response = tasknote.logic.TaskNoteControl.command.getFeedBack();
    return response;
}