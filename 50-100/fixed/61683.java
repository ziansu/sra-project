@java.lang.Override
public void cancel(org.andork.swing.async.Task task) {
    if (!(tasks.remove(task))) {
        return ;
    }
    org.andork.swing.async.Task.State state = task.getState();
    if ((state != (Task.State.CANCELED)) && (state != (Task.State.CANCELING))) {
        task.cancel();
    }
    fireTaskRemoved(task);
}