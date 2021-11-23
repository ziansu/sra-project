private java.util.Calendar getCalendarForDate(devplugin.Program prog) {
    java.util.Calendar cal = java.util.GregorianCalendar.getInstance();
    cal.set(java.util.Calendar.MILLISECOND, 0);
    cal.set(java.util.Calendar.SECOND, 0);
    cal.set(java.util.Calendar.DAY_OF_MONTH, prog.getDate().getDayOfMonth());
    cal.set(java.util.Calendar.MONTH, prog.getDate().getMonth());
    cal.set(java.util.Calendar.YEAR, prog.getDate().getYear());
    return cal;
}