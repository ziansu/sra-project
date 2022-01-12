public com.orientechnologies.orient.core.sql.method.intl.OCalendar setDate(int year, int month, int day, int hour, int minute, int second, java.lang.String timezoneid) {
    try {
        this.calendar.set(year, month, day, hour, minute, second);
        this.calendar.setTimeZone(java.util.com.ibm.icu.util.TimeZone.getTimeZone(timezoneid));
    } catch (java.lang.Exception ex) {
    }
    return this;
}