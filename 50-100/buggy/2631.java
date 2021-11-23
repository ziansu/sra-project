private java.lang.String formatDate(long date) {
    date = date * 1000;
    java.lang.String formattedDate = null;
    final java.lang.String targetFormat = "yyyy-MM-dd";
    java.util.Date theDate = new java.util.Date(date);
    try {
        final java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(targetFormat);
        formattedDate = formatter.format(theDate);
    } catch (java.lang.Exception e) {
        formattedDate = java.lang.Long.toString(date);
    }
    return formattedDate;
}