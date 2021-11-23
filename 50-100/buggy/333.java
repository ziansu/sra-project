public static java.lang.String formatDateString(java.lang.String dateString) {
    java.text.SimpleDateFormat formattedDate = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
    formattedDate.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    java.util.Date inputDate = null;
    try {
        inputDate = formattedDate.parse(dateString);
    } catch (java.text.ParseException error) {
        inputDate = java.util.Calendar.getInstance().getTime();
    }
    java.text.SimpleDateFormat outputFormat = new java.text.SimpleDateFormat("MM/dd/yyyy", java.util.Locale.US);
    outputFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    return outputFormat.format(inputDate);
}