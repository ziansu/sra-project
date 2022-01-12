private void runCommandLoopUntilExitCommand() {
    seedu.addressbook.Command command;
    do {
        java.lang.String userCommandText = ui.getUserCommand();
        command = new seedu.addressbook.parser.Parser().parseCommand(userCommandText);
        seedu.addressbook.CommandResult result = executeCommand(command);
        recordResult(result);
        ui.showResultToUser(result);
    } while (!(seedu.addressbook.ExitCommand.isExit(command)) );
}