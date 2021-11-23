@java.lang.Override
public boolean run(seedu.jimi.model.task.ReadOnlyTask task) {
    if (task instanceof seedu.jimi.model.event.Event) {
        return false;
    }
    if ((isCompleteState) == true) {
        return task.isCompleted();
    }else {
        return !(task.isCompleted());
    }
}