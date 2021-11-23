@java.lang.Override
public int getIndexFromTask(main.model.task.ReadOnlyTask task) throws main.model.task.UniqueTaskList.TaskNotFoundException {
    int index;
    java.util.List<main.model.task.ReadOnlyTask> temp = new main.model.LinkedList<main.model.task.ReadOnlyTask>();
    temp = taskTracker.getTaskList();
    index = temp.lastIndexOf(task);
    return index;
}