public static boolean isValidPeriod(seedu.taskitty.model.task.TaskDate startDate, seedu.taskitty.model.task.TaskTime startTime, seedu.taskitty.model.task.TaskDate endDate, seedu.taskitty.model.task.TaskTime endTime) {
    boolean isValid = false;
    if ((startDate == null) || (endDate == null)) {
        isValid = true;
    }else
        if (startDate.isBefore(endDate)) {
            isValid = true;
        }else
            if ((startDate.equals(endDate)) && (startTime.isBefore(endTime))) {
                isValid = true;
            }
        
    
    return isValid;
}