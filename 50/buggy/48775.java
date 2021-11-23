@java.lang.Override
public boolean apply(java.lang.Boolean input) {
    this.pendingRespondingTasks.remove(task[0]);
    return true;
}