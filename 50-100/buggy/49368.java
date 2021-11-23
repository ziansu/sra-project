@java.lang.Override
public seedu.whatsnext.logic.commands.CommandResult execute() throws seedu.whatsnext.logic.commands.exceptions.CommandException {
    java.util.Objects.requireNonNull(reminderString);
    java.lang.String currentReminderSetting = model.getReminderSetting();
    if (reminderString.equals(currentReminderSetting)) {
        seedu.whatsnext.logic.commands.RemindCommand.logger.info(seedu.whatsnext.logic.commands.RemindCommand.MESSAGE_NO_CHANGE_IN_REMINDER_SETTING);
        throw new seedu.whatsnext.logic.commands.exceptions.CommandException(((seedu.whatsnext.logic.commands.RemindCommand.MESSAGE_NO_CHANGE_IN_REMINDER_SETTING) + currentReminderSetting));
    }else {
        model.setReminderSetting(reminderString);
        seedu.whatsnext.logic.commands.RemindCommand.logger.fine(((seedu.whatsnext.logic.commands.RemindCommand.MESSAGE_SUCCESS) + (reminderString)));
        return new seedu.whatsnext.logic.commands.CommandResult(((seedu.whatsnext.logic.commands.RemindCommand.MESSAGE_SUCCESS) + (reminderString)));
    }
}