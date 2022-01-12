private void validateCommand(org.spine3.examples.todolist.UpdateTaskDescription cmd) {
    org.spine3.examples.todolist.Task taskState = getState();
    java.lang.String description = cmd.getUpdatedDescription();
    com.google.common.base.Preconditions.checkNotNull(description, "Description cannot be null.");
    if ((description.length()) < 3) {
        throw new java.lang.IllegalArgumentException("Description should contains at least 3 alphanumeric symbols.");
    }
    validateCommandOnDeletionAndCompletion();
}