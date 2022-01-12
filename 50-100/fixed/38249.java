public java.lang.String execute() {
    task = Magical.ui.getLastTaskListDisplayed().get(taskID);
    java.util.Set<java.lang.String> tags = task.getTags();
    tags.add(tag);
    task.setTags(tags);
    try {
        Magical.storage.updateTask(task);
        hasExecuted = true;
        return (tag) + " added to task";
    } catch (java.io.IOException e) {
        return "unable to add tag to task";
    }
}