private java.lang.String addFloatingTasks() {
    java.lang.String name = parser.getName();
    java.lang.String tag = parser.getTag();
    Task task = new Task(TASK_TYPE.FLOATING, name, tag);
    floatingTasks.add(task);
    return ("Floating task \"" + name) + "\" added to floatingTasks.";
}