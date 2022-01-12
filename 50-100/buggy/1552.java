public static java.util.Date getDateTime(java.lang.Object d) {
    java.util.Date result = null;
    if (d instanceof java.lang.String) {
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(net.rcarz.jiraclient.Field.DATETIME_FORMAT);
        result = df.parse(((java.lang.String) (d)), new java.text.ParsePosition(0));
    }
    return result;
}