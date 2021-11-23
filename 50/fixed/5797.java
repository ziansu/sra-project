@java.lang.Override
public void moveTask(com.druger.refresher.models.ModelTask task) {
    if ((task.getDate()) != 0) {
        alarmHelper.setAlarm(task);
    }
    if ((onTaskRestoreListener) != null) {
        onTaskRestoreListener.onTaskRestore(task);
    }
}