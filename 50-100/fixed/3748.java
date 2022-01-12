public textbuddytemp.model.TaskList getTasksByTags(java.util.ArrayList<java.lang.String> tags) {
    textbuddytemp.model.TaskList tasks = new textbuddytemp.model.TaskList();
    if (tags.isEmpty()) {
        return this;
    }
    for (textbuddytemp.model.Task i : listOfTasks) {
        for (java.lang.String tag : i.getTags()) {
            if (tags.contains(tag)) {
                tasks.addTask(i);
                break;
            }
        }
    }
    return tasks;
}