public static java.lang.String getReadableDate(long timestamp) {
    java.util.Date date = new java.util.Date(timestamp);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    java.lang.String dateString = ((((java.lang.String.valueOf(calendar.get(java.util.Calendar.DAY_OF_MONTH))) + "/") + (java.lang.String.valueOf(((calendar.get(java.util.Calendar.MONTH)) + 1)))) + "/") + (java.lang.String.valueOf(calendar.get(java.util.Calendar.YEAR)));
    return dateString;
}