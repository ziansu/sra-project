public void changeToToday() {
    changeDay(todaysDay);
    changeMonth(todaysMonth);
    changeYear(todaysYear);
    calendar.set(java.util.Calendar.DATE, todaysDay);
    calendar.set(java.util.Calendar.MONTH, todaysMonth);
    calendar.set(java.util.Calendar.YEAR, todaysYear);
    java.lang.System.out.println(todaysDay);
    java.lang.System.out.println(todaysMonth);
    java.lang.System.out.println(todaysYear);
    update();
}