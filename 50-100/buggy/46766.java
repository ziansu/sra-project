@java.lang.Override
public seedu.inbx0.logic.commands.CommandResult execute(java.lang.String commandText) {
    logger.info((("----------------[USER COMMAND][" + commandText) + "]"));
    seedu.inbx0.logic.commands.Command command = parser.parseCommand(commandText);
    java.lang.System.out.println(commandText);
    previousCommandText.push(commandText);
    command.setData(model);
    if (command.canUndo())
        model.saveTaskListHistory();
    
    return command.execute();
}