public int getFirstDayOfWeek(java.util.Date date) {
    gregorianCalendar.setTime(date);
    return gregorianCalendar.get(java.util.Calendar.DAY_OF_WEEK);
}