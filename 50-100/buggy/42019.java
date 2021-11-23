@java.lang.Override
public boolean equals(java.lang.Object other) {
    return (other == (this)) || (((other instanceof seedu.task.model.task.Duration) && (this.start.equals(((seedu.task.model.task.Duration) (other)).start))) && (this.start.equals(((seedu.task.model.task.Duration) (other)).end)));
}