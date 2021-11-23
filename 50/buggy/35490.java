public static java.lang.String getUTC(java.lang.String format) {
    java.util.Date date = new java.util.Date();
    return de.bytemind.core.tools.DateTime.getGMT(date, format);
}