public void executeCommand(java.lang.String commandString) {
    if (commandString.equalsIgnoreCase("help")) {
        showHelp();
        activeView = app.constants.ViewConstants.ViewType.TEXT_VIEW;
        showActiveView();
        return ;
    }
    commandString = commandString.trim();
    app.model.command.Command cmd = parser.parseCommand(commandString);
    cmd.execute();
    showActiveView();
    if (!(cmd.getFeedback().isEmpty())) {
        viewManager.setStatus(cmd.getFeedback(), cmd.getStatusType());
    }
}