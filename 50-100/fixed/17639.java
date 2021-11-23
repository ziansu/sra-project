private int findHourPosition(int hour) {
    int i = 0;
    for (amai.org.conventions.events.ProgrammeConventionEvent event : events) {
        if ((event.getTimeSection().get(java.util.Calendar.HOUR_OF_DAY)) >= hour) {
            return i;
        }
        i++;
    }
    return -1;
}