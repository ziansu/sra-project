@java.lang.Override
public long getDateHeader(java.lang.String name) {
    java.lang.String v = getHeader(name);
    if (v == null) {
        return -1;
    }
    for (java.text.DateFormat df : dateFormats) {
        try {
            java.util.Date date = df.parse(v);
            return date.getTime();
        } catch (java.text.ParseException pe) {
        }
    }
    throw new java.lang.IllegalArgumentException(("Unhandled date format: " + v));
}