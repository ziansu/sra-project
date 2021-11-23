@java.lang.Override
public void activateTask(@android.support.annotation.NonNull
com.example.android.architecture.blueprints.todoapp.data.Task activeTask) {
    com.google.common.base.Preconditions.checkNotNull(activeTask, "activeTask cannot be null!");
    mTasksRepository.activateTask(activeTask);
    mTasksView.showTaskMarkedActive();
    loadTasks(false, false);
}