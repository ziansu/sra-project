private void init_calendars() {
    startTimeCalendar = java.util.Calendar.getInstance();
    clearTimeFields(startTimeCalendar);
    int minutes = org.mcjug.aameetingmanager.util.DateTimeUtil.roundMinutes(startTimeCalendar.get(java.util.Calendar.MINUTE));
    startTimeCalendar.set(java.util.Calendar.MINUTE, minutes);
    endTimeCalendar = java.util.Calendar.getInstance();
    endTimeCalendar.add(java.util.Calendar.HOUR_OF_DAY, 1);
    clearTimeFields(endTimeCalendar);
    endTimeCalendar.set(java.util.Calendar.MINUTE, minutes);
}