public static java.util.Calendar toCalendar(int day, int month, int year) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(java.util.Calendar.YEAR, year);
    cal.set(java.util.Calendar.MONTH, month);
    cal.set(java.util.Calendar.DAY_OF_MONTH, day);
    cal.getTime();
    return cal;
}