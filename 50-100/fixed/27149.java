private int getRetryDaysCount(org.motechproject.model.DayOfWeek preferredDayOfWeek, org.joda.time.LocalDate date) {
    int count = 0;
    while ((date.getDayOfWeek()) != (preferredDayOfWeek.getValue())) {
        date = date.minusDays(1);
        count++;
    } 
    return count;
}