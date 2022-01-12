seedu.task.model.task.Task generatePerson(int seed) throws java.lang.Exception {
    return new seedu.task.model.task.Task(new seedu.task.model.task.Description(("Person " + seed)), null, null, new seedu.task.model.tag.UniqueTagList(new seedu.task.model.tag.Tag(("tag" + (java.lang.Math.abs(seed)))), new seedu.task.model.tag.Tag(("tag" + (java.lang.Math.abs((seed + 1)))))));
}