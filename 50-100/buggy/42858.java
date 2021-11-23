public static logic.tasks.Task getInstance(java.lang.String title, java.util.Calendar startDate, java.util.Calendar endDate, int recurringPeriod) {
    if ((startDate == null) && (endDate == null)) {
        return new logic.tasks.Task(title);
    }else
        if (recurringPeriod > 0) {
            return new logic.tasks.RecurringTask(title, startDate, endDate, recurringPeriod);
        }else
            if (endDate == null) {
                return new logic.tasks.Deadline(title, startDate);
            }else {
                return new logic.tasks.Session(title, startDate, endDate);
            }
        
    
}