@java.lang.Override
public void associate(com.task.Task task) {
    this.task = task;
    initialTime = task.getTaskTime();
    targetTime = 0;
    currentTime = initialTime;
}