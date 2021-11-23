private java.lang.String getMonthYearName(java.util.Date toDate) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTime(toDate);
    int month = (c.get(java.util.Calendar.MONTH)) + 1;
    int year = (c.get(java.util.Calendar.YEAR)) % 100;
    java.lang.String monthString = c.getDisplayName(java.util.Calendar.MONTH, java.util.Calendar.LONG, java.util.Locale.ENGLISH);
    java.lang.String yearString = java.lang.String.valueOf(year);
    return (monthString + " ") + yearString;
}