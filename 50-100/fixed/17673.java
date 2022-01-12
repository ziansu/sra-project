public java.time.LocalDateTime calculateDueDate(java.time.LocalDateTime submitDate, java.time.Duration turnAround) {
    validateSubmitDate(submitDate);
    validateTurnAround(turnAround);
    java.time.LocalDateTime dueDate = submitDate;
    for (int i = 0; i < (turnAround.toHours()); ++i) {
        dueDate = nextWorkHour(dueDate);
    }
    return dueDate;
}