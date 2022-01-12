public void updateToNextRecurringTask() {
    assert isRecurring();
    if (isTaskWithDeadline()) {
        startDateTime = getNextRecurringDateTime(startDateTime);
        endDateTime = getNextRecurringDateTime(endDateTime);
    }else
        if (isEvent()) {
            long days = java.time.temporal.ChronoUnit.DAYS.between(endDateTime, getNextRecurringDateTime(endDateTime));
            startDateTime = startDateTime.plusDays(days);
            endDateTime = endDateTime.plusDays(days);
        }
    
    setCompleted(false);
}