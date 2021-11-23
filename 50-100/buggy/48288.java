private seedu.address.model.task.Task getNewTask() {
    if (((startDate) == null) && ((endDate) != null)) {
        return new seedu.address.model.task.Deadline(id, name, description, endDate, tagList);
    }
    if (((startDate) != null) && ((endDate) != null)) {
        return new seedu.address.model.task.Event(id, name, description, startDate, endDate, tagList);
    }
    java.lang.System.out.println(id);
    return new seedu.address.model.task.Task(id, name, description, tagList);
}