public java.lang.String execute() {
    main.Task task = Magical.ui.getLastTaskListDisplayed().get(taskID);
    java.util.Set<java.lang.String> tags = task.getTags();
    tags.remove(tag);
    task.setTags(tags);
    try {
        Magical.storage.updateTask(task);
        hasExecuted = true;
        return (tag) + " removed from task";
    } catch (java.io.IOException e) {
        return "unable to remove tag from task";
    }
}