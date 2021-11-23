public void setTaskEndTime(seedu.task.model.task.TaskTime taskEndTime) throws seedu.task.commons.exceptions.IllegalValueException {
    if (taskEndTime == null) {
    }else
        if (((this.taskStartTime) == null) || ((this.taskEndTime.compareTo(taskStartTime)) >= 0)) {
            this.taskEndTime = taskEndTime;
        }else {
            throw new seedu.task.commons.exceptions.IllegalValueException(seedu.task.model.task.Task.MESSAGE_INVALID_TIME);
        }
    
}