public static boolean isValidPriority(java.lang.String priority) {
    return ((priority.equals(seedu.doist.model.task.Priority.PriorityLevel.VERY_IMPORTANT.name())) || (priority.equals(seedu.doist.model.task.Priority.PriorityLevel.IMPORTANT.name()))) || (priority.equals(seedu.doist.model.task.Priority.PriorityLevel.NORMAL.name()));
}