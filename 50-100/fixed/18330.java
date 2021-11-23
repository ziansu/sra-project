public java.lang.String dbToAdapterDate(java.lang.String date) {
    java.text.SimpleDateFormat originalDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd KK:mm:ss");
    java.text.SimpleDateFormat requiredDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd KK:mm:ss");
    try {
        date = requiredDateFormat.format(originalDateFormat.parse(date));
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return date;
}