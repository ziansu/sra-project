public static java.util.Date getDate(java.time.LocalDate l) {
    int day = l.getDayOfMonth();
    int month = l.getMonthValue();
    int year = l.getYear();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(year, month, day);
    return cal.getTime();
}