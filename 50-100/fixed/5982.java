public java.lang.String getDateString() {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MMMM yyyy", java.util.Locale.getDefault());
    java.lang.String noDateStr = format.format(date.getTime());
    int val = date.get(java.util.Calendar.DAY_OF_MONTH);
    return (((java.lang.String.format(java.util.Locale.getDefault(), "%2d", val)) + (getDayOfMonthSuffix(val))) + "\n") + noDateStr;
}