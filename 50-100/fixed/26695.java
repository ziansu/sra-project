@java.lang.Override
public seedu.commando.logic.commands.CommandResult execute() throws seedu.commando.commons.exceptions.IllegalValueException, seedu.commando.logic.commands.NoEventsCenterException {
    seedu.commando.commons.core.EventsCenter eventsCenter = getEventsCenter();
    java.lang.String anchor = "";
    if (!(commandWord.isEmpty())) {
        anchor = seedu.commando.commons.core.Config.getUserGuideAnchorForCommandWord(commandWord).orElseThrow(() -> new seedu.commando.commons.exceptions.IllegalValueException(Messages.UNKNOWN_COMMAND_FOR_HELP));
    }
    eventsCenter.post(new seedu.commando.commons.events.ui.ShowHelpRequestEvent(anchor));
    return new seedu.commando.logic.commands.CommandResult(seedu.commando.commons.core.Messages.HELP_WINDOW_SHOWN);
}