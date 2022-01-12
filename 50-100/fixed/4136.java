private static java.lang.String executeShow(java.lang.String userCommand) {
    tasknote.logic.ShowInterval timeInterval = tasknote.parser.Parser.parseShow(userCommand, true);
    int countInterval = tasknote.parser.Parser.getInterval(userCommand, true);
    tasknote.logic.TaskNoteControl.command = new tasknote.logic.Commands.ShowCommand(tasknote.logic.TaskNoteControl.taskNote, timeInterval, countInterval);
    tasknote.logic.TaskNoteControl.command.execute();
    tasknote.logic.TaskNoteControl.command.refreshDisplay();
    java.lang.String response = tasknote.logic.TaskNoteControl.command.getFeedBack();
    return response;
}