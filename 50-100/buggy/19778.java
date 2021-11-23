public java.lang.String marshal(java.util.Date date) throws java.lang.Exception {
    if (date == null) {
        return "";
    }
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(com.docdoku.server.rest.util.DateAdapter.pattern);
    df.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    return df.format(date);
}