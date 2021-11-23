private static java.lang.String getDaysInMonthBound(int year, int month) {
    java.util.Calendar cal = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT"));
    cal.set(java.util.Calendar.YEAR, year);
    cal.set(java.util.Calendar.MONTH, month);
    cal.set(java.util.Calendar.DAY_OF_MONTH, 1);
    return new java.lang.Integer(cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH)).toString();
}