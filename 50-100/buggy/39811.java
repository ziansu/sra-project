public static boolean isValidPriority(java.lang.String priority) {
    return ((priority.equals(seedu.doist.model.task.Priority.PriorityLevel.VERY_IMPORTANT.toString())) || (priority.equals(seedu.doist.model.task.Priority.PriorityLevel.IMPORTANT.toString()))) || (priority.equals(seedu.doist.model.task.Priority.PriorityLevel.NORMAL.toString()));
}