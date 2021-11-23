public static java.lang.String formatDate(java.util.Date date) {
    java.text.SimpleDateFormat d = new java.text.SimpleDateFormat("MM-dd-yyyy hh:mm aa");
    java.lang.String dateString = d.format(date);
    if (dateString.equals("01-01-0001 12:00 AM")) {
        dateString = "NEVER";
    }
    return dateString;
}