public static java.lang.String convDateToString(java.lang.String pattern, java.util.Date date) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(com.adms.utils.DateUtil.defaultDatePattern);
    java.lang.String arg = null;
    if (date != null) {
        arg = sdf.format(date);
    }
    return arg;
}