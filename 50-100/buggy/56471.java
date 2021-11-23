private static java.lang.String executeSearch(java.lang.String userCommand) {
    java.util.ArrayList<tasknote.shared.TaskObject> displayList = tasknote.logic.TaskNoteControl.taskNote.getDisplayList();
    java.util.ArrayList<java.lang.Integer> searchIds = tasknote.parser.Parser.parseSearch(userCommand, displayList);
    tasknote.logic.TaskNoteControl.command = new tasknote.logic.Commands.SearchCommand(tasknote.logic.TaskNoteControl.taskNote, searchIds);
    tasknote.logic.TaskNoteControl.command.execute();
    tasknote.logic.TaskNoteControl.command.refreshDisplay();
    java.lang.String response = tasknote.logic.TaskNoteControl.command.getFeedBack();
    return response;
}