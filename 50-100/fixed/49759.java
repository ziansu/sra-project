public static java.util.Date parse(java.lang.String ds, java.text.SimpleDateFormat aFormat) {
    if ((ds == null) || (aFormat == null)) {
        return null;
    }
    try {
        return aFormat.parse(ds);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return null;
}