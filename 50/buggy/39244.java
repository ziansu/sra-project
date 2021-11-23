@java.lang.Override
public void associate(com.task.Task task) {
    this.task = task;
    initialTime = 0;
    targetTime = task.getTaskTime();
    currentTime = initialTime;
}