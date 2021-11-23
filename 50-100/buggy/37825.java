public java.util.Calendar newCalendar() {
    java.util.Calendar c = java.util.Calendar.getInstance();
    java.util.TimeZone server_tz = c.getTimeZone();
    java.lang.String time_zone = m_settings.getString("time zone");
    if (time_zone != null) {
        java.util.TimeZone site_tz = java.util.TimeZone.getTimeZone(time_zone);
        c.setTimeZone(site_tz);
        c.add(java.util.Calendar.MILLISECOND, ((site_tz.getOffset(c.getTimeInMillis())) - (server_tz.getOffset(c.getTimeInMillis()))));
    }
    return c;
}