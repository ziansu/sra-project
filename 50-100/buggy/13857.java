public static java.util.Calendar parseStringToCalendar(java.lang.String datestring) {
    java.util.Calendar date = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
    try {
        date.setTime(format.parse(datestring));
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return date;
}