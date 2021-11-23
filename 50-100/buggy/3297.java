@java.lang.Override
public seedu.task.logic.commands.CommandResult execute() {
    if (commandToShowUser.isEmpty()) {
        seedu.task.commons.core.EventsCenter.getInstance().post(new seedu.task.commons.events.ui.ShowHelpRequestEvent());
        return new seedu.task.logic.commands.CommandResult(seedu.task.logic.commands.HelpCommand.SHOWING_HELP_MESSAGE);
    }else {
        return new seedu.task.logic.commands.CommandResult(seedu.task.logic.commandlibrary.CommandLibrary.getInstance().getCommandUsage(commandToShowUser.trim()));
    }
}