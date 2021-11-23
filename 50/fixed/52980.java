public void update() {
    assert (repeatingTasks) != null : "Repeating Task list reference cannot be null";
    long daysElapsed = java.time.temporal.ChronoUnit.DAYS.between(initialisedTime, java.time.LocalDate.now());
    if (daysElapsed <= 0) {
        return ;
    }
    updateRepeatingTasks();
}