private static seedu.task.model.task.Task createEditedTask(seedu.task.model.task.ReadOnlyTask taskToEdit, seedu.task.logic.commands.EditCommand.EditTaskDescriptor editTaskDescriptor) {
    assert taskToEdit != null;
    seedu.task.model.task.Description updatedDescription = editTaskDescriptor.getDescription().orElseGet(taskToEdit::getDescription);
    seedu.task.model.tag.UniqueTagList updatedTags = editTaskDescriptor.getTags().orElseGet(taskToEdit::getTags);
    return new seedu.task.model.task.Task(updatedDescription, null, null, updatedTags);
}