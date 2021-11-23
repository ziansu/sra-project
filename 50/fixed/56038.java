@java.lang.Override
public void clearCompletedTasks() {
    mTasksRepository.clearCompletedTasks();
    mTasksView.showCompletedTasksCleared();
    loadTasks(false, true);
}