public static java.sql.Date yearMonthToDate(final java.time.YearMonth ym) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.clear();
    cal.set(java.util.Calendar.MONTH, ((ym.getMonthValue()) - 1));
    cal.set(java.util.Calendar.DAY_OF_MONTH, 1);
    cal.set(java.util.Calendar.YEAR, ym.getYear());
    return ((java.sql.Date) (cal.getTime()));
}