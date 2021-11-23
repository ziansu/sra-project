private static java.lang.String getShamsiDate(java.util.Date date) {
    java.util.Locale loc = new java.util.Locale("en_US");
    com.zohaltech.app.mobiledatamonitor.classes.SolarCalendar solarCalendar = new com.zohaltech.app.mobiledatamonitor.classes.SolarCalendar(date);
    return ((((java.lang.String.valueOf(solarCalendar.year)) + "/") + (java.lang.String.format(loc, "%02d", solarCalendar.month))) + "/") + (java.lang.String.format(loc, "%02d", solarCalendar.date));
}