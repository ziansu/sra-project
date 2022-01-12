public seedu.todolist.model.task.Task toModelType() throws seedu.todolist.commons.exceptions.IllegalValueException {
    final java.util.List<seedu.todolist.model.tag.Tag> personTags = new java.util.ArrayList<>();
    for (seedu.todolist.storage.XmlAdaptedTag tag : tagged) {
        personTags.add(tag.toModelType());
    }
    final seedu.todolist.model.task.Name name = new seedu.todolist.model.task.Name(this.name);
    final seedu.todolist.model.tag.UniqueTagList tags = new seedu.todolist.model.tag.UniqueTagList(personTags);
    return new seedu.todolist.model.task.Task(name, null, null, tags);
}