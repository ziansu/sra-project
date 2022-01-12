@java.lang.Override
public seedu.whatsnext.commons.core.UnmodifiableObservableList<seedu.whatsnext.model.task.BasicTaskFeatures> getFilteredTaskList() {
    return new seedu.whatsnext.commons.core.UnmodifiableObservableList(filteredTasks);
}