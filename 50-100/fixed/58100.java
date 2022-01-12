public static java.util.GregorianCalendar stringToCalendar(java.lang.String dateStr) {
    try {
        if (dateStr == null) {
            return null;
        }
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        calendar.setTime(udo.util.Utility.fmt.parse(dateStr));
        return calendar;
    } catch (java.text.ParseException e) {
        java.lang.System.err.println("Invalid date format");
        return null;
    }
}