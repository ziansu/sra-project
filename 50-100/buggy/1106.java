private int findHourPosition(int hour) {
    int i = 0;
    for (amai.org.conventions.events.ProgrammeConventionEvent event : events) {
        if ((amai.org.conventions.events.activities.ProgrammeActivity.floorHour(event.getEvent().getStartTime())) == hour) {
            return i;
        }
        i++;
    }
    return -1;
}