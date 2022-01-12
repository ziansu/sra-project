public static boolean evaluate(java.util.Date date1, java.util.Date date2) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(CheckConstants.DEFAULT_DATE_FORMAT);
    java.lang.String date1String = null;
    java.lang.String date2String = null;
    if (date1 != null) {
        date1String = sdf.format(date1);
    }
    if (date2 != null) {
        date2String = sdf.format(date2);
    }
    return date1String.equals(date2String);
}