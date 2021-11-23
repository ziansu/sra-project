@java.lang.Override
public void uiFeedbackAfterRun() {
    if ((indx) >= (tasks.size())) {
        startStop(false);
    }
    tasksComposite.update(tasks);
    tasksComposite.redraw();
}