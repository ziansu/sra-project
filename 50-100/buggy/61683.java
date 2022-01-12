@java.lang.Override
public void cancel(org.andork.swing.async.Task task) {
    org.andork.swing.async.Task removed = null;
    org.andork.swing.async.Task.State state = task.getState();
    if ((state != (Task.State.CANCELED)) && (state != (Task.State.CANCELING))) {
        task.cancel();
    }
    int index = tasks.indexOf(task);
    if (index > 0) {
        removed = tasks.remove(index);
    }
    if (removed != null) {
        fireTaskRemoved(removed);
    }
}