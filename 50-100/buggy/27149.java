private int getRetryDaysCount(org.motechproject.model.DayOfWeek preferredDayOfWeek) {
    int count = 0;
    org.joda.time.LocalDate date = org.motechproject.util.DateUtil.today();
    while ((date.getDayOfWeek()) != (preferredDayOfWeek.getValue())) {
        date = date.minusDays(1);
        count++;
    } 
    return count;
}