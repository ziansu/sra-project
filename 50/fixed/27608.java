seedu.task.model.task.Task generatePersonWithName(java.lang.String description) throws java.lang.Exception {
    return new seedu.task.model.task.Task(new seedu.task.model.task.Description(description), null, null, new seedu.task.model.tag.UniqueTagList(new seedu.task.model.tag.Tag("tag")));
}