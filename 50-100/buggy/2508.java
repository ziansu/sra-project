public void updateToNextRecurringTask() {
    assert isRecurring();
    if (isTaskWithDeadline()) {
        setStartDateTime(getNextRecurringDateTime(startDateTime));
        setEndDateTime(getNextRecurringDateTime(endDateTime));
    }else
        if (isEvent()) {
            long days = java.time.temporal.ChronoUnit.DAYS.between(endDateTime, getNextRecurringDateTime(endDateTime));
            setStartDateTime(startDateTime.plusDays(days));
            setEndDateTime(endDateTime.plusDays(days));
        }
    
    setCompleted(false);
}