public java.util.Calendar newCalendar() {
    java.util.Calendar c = java.util.Calendar.getInstance();
    java.lang.String time_zone = m_settings.getString("time zone");
    if (time_zone != null) {
        java.util.TimeZone site_tz = java.util.TimeZone.getTimeZone(time_zone);
        c.setTimeZone(site_tz);
    }
    return c;
}