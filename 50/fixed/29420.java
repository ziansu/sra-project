public static boolean Contains(java.lang.String test) {
    for (seedu.address.model.task.Priority.acceptedPriority enumValue : seedu.address.model.task.Priority.acceptedPriority.values()) {
        if (enumValue.name().equals(test)) {
            return true;
        }
    }
    return false;
}