@java.lang.Override
public seedu.address.logic.commands.CommandResult executeUndoableCommand() throws seedu.address.logic.commands.exceptions.CommandException {
    try {
        model.removeTag(tag);
    } catch (seedu.address.model.person.exceptions.DuplicatePersonException dpe) {
        throw new seedu.address.logic.commands.exceptions.CommandException(seedu.address.logic.commands.AddCommand.MESSAGE_DUPLICATE_PERSON);
    } catch (seedu.address.model.person.exceptions.PersonNotFoundException pnfe) {
        throw new seedu.address.logic.commands.exceptions.CommandException((("Tag: " + (tag.toString())) + (seedu.address.logic.commands.RemoveCommand.MESSAGE_TAG_NOT_FOUND)));
    }
    return new seedu.address.logic.commands.CommandResult(java.lang.String.format(seedu.address.logic.commands.RemoveCommand.MESSAGE_REMOVE_SUCCESS, tag.toString()));
}