public void executeInverseCommand() throws java.text.ParseException, seedu.todoapp.commons.exceptions.IllegalValueException, seedu.todoapp.logic.commands.exceptions.CommandException, seedu.todoapp.model.person.UniqueTaskList.TaskInvalidTimestampsException {
    this.undoCommand.setData(model);
    this.undoCommand.execute();
}