@java.lang.Override
public synchronized void deleteTask(todolist.model.task.ReadOnlyTask target) throws todolist.model.task.UniqueTaskList.TaskNotFoundException {
    todoList.removeTask(target);
    indicateToDoListChanged();
}