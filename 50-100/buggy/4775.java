private java.lang.String addFloatingTasks() {
    java.lang.String name = parser.getName();
    java.lang.String tag = parser.getTag();
    Task task = new Task(TASK_TYPE.FLOATING, name, tag);
    java.util.ArrayList<Task> floatingTasks = logic.getFloatingTasks();
    floatingTasks.add(task);
    logic.setFloatingTasks(floatingTasks);
    return ("Floating task \"" + name) + "\" added to floatingTasks.";
}