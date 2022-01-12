private boolean isToday(int day, int month, int year) {
    return (((mCalendarToday.get(java.util.Calendar.MONTH)) == month) && ((mCalendarToday.get(java.util.Calendar.YEAR)) == year)) && ((mCalendarToday.get(java.util.Calendar.DAY_OF_MONTH)) == day);
}