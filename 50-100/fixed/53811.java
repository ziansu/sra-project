public void changeToToday() {
    changeDay(todaysDay);
    changeMonth(todaysMonth);
    changeYear(todaysYear);
    calendar.set(java.util.Calendar.DATE, todaysDay);
    calendar.set(java.util.Calendar.MONTH, todaysMonth);
    calendar.set(java.util.Calendar.YEAR, todaysYear);
    update();
}