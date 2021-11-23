@java.lang.Override
public boolean run(seedu.task.model.task.ReadOnlyTask task) {
    boolean isPresent = false;
    java.util.ArrayList<java.lang.Integer> occurrenceIndexList = searchList(task);
    if ((occurrenceIndexList.size()) > 0) {
        isPresent = true;
    }
    return isPresent;
}