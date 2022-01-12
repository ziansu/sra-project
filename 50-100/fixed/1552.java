private static java.util.Date getDateTime(java.lang.Object d, java.lang.String pattern) {
    java.util.Date result = null;
    if (d instanceof java.lang.String) {
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(pattern);
        result = df.parse(((java.lang.String) (d)), new java.text.ParsePosition(0));
    }
    return result;
}