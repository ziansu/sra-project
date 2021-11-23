seedu.task.model.task.Task adam() throws java.lang.Exception {
    seedu.task.model.task.Description name = new seedu.task.model.task.Description("Adam Brown");
    seedu.task.model.tag.Tag tag1 = new seedu.task.model.tag.Tag("tag1");
    seedu.task.model.tag.Tag tag2 = new seedu.task.model.tag.Tag("longertag2");
    seedu.task.model.tag.UniqueTagList tags = new seedu.task.model.tag.UniqueTagList(tag1, tag2);
    return new seedu.task.model.task.Task(name, null, tags);
}