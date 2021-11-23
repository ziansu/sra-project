public boolean isSameTask(seedu.flexitrack.model.task.ReadOnlyTask task) {
    return (((getFullName().equals(task.getName().fullName)) && (getDueDate().equals(task.getDueDate().setTime))) && (getStartTime().equals(task.getStartTime().setTime))) && (getEndTime().equals(task.getEndTime().setTime));
}