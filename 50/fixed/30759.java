public boolean pop() {
    java.lang.System.out.println(taskStack.toString());
    javafx.collections.ObservableList<seedu.jobs.model.task.Task> replacement = taskStack.pop();
    this.internalList.setAll(replacement);
    return true;
}