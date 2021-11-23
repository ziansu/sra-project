@java.lang.Override
public boolean equals(java.lang.Object other) {
    if ((this) == other) {
        return true;
    }
    if ((other == null) || ((getClass()) != (other.getClass()))) {
        return false;
    }
    seedu.tasklist.model.task.Status status = ((seedu.tasklist.model.task.Status) (other));
    return (this.status) == (status.status);
}