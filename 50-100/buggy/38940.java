public static java.util.GregorianCalendar convertStringToCalendar(java.lang.String date, java.text.DateFormat sdf) {
    java.util.Date d;
    try {
        d = sdf.parse(date);
        java.util.GregorianCalendar cal = new java.util.GregorianCalendar();
        cal.setTime(d);
        java.lang.String str = cal.toString();
        return cal;
    } catch (java.text.ParseException e) {
        Util.logger.debug(java.text.MessageFormat.format("DateFormatError Pattern:{0} Text:{1}", sdf, date));
    }
    return null;
}