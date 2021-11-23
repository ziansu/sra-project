@net.newString.crux.core.stable
public static synchronized java.util.Date parseDate(java.lang.String pattern, java.lang.String dateStr) {
    java.text.SimpleDateFormat sdf = net.newString.crux.core.lang.DateUtil.getInstance().get(pattern);
    if (sdf == null) {
        sdf = new java.text.SimpleDateFormat(pattern);
        net.newString.crux.core.lang.DateUtil.getInstance().put(pattern, sdf);
    }
    try {
        return sdf.parse(dateStr);
    } catch (java.text.ParseException e) {
    }
    return null;
}