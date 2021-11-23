public boolean isSameTask(seedu.flexitrack.model.task.ReadOnlyTask task) {
    return (((getFullName().equals(task.getName().fullName)) && (getDueDate().equals(task.getDueDate().toString()))) && (getStartTime().equals(task.getStartTime().toString()))) && (getEndTime().equals(task.getEndTime().toString()));
}