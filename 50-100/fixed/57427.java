public java.lang.String datetoString(java.lang.String time) {
    java.text.DateFormat inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    inputFormat.setTimeZone(java.util.TimeZone.getDefault());
    java.text.DateFormat outputFormat = new java.text.SimpleDateFormat("HH:mm");
    java.util.Date parsed = null;
    try {
        parsed = inputFormat.parse(time);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return outputFormat.format(parsed);
}