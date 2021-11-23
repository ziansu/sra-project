public void resetTask(long now, com.hawky.jhttpload.Task task) {
    if (!(tasks.contains(task))) {
        return ;
    }
    this.cancelTask(task);
    task.execTimeMillis = now + (task.intervalMillis);
    this.submitTask(task);
}