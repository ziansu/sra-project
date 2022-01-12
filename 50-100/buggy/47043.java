public static java.lang.String getFormattedDate(int year, int month) {
    final java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(java.util.Calendar.YEAR, year);
    calendar.set(java.util.Calendar.MONTH, month);
    java.lang.String monthDisplay = calendar.getDisplayName(java.util.Calendar.MONTH, java.util.Calendar.LONG, java.util.Locale.US);
    return (monthDisplay + "/") + year;
}