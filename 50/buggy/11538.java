public static net.sf.memoranda.date.CalendarDate yesterday() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.roll(java.util.Calendar.DATE, false);
    return new net.sf.memoranda.date.CalendarDate(cal);
}